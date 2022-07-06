package crudtoko;

import java.io.IOException;
import static java.lang.System.exit;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {
    ObservableList<Detail> listPD=FXCollections.observableArrayList();
    @FXML
    private Button btnBatal;
    
    @FXML
    private Button btnAddItem;
    
    @FXML
    private Button BtnDelItem;
    
    @FXML
    private DatePicker dpTgl;
    
    @FXML
    private TableColumn<Detail, Integer> harga;
    
    @FXML
    private TableColumn<Detail, Integer> jml;
    
    @FXML
    private TableColumn<Detail, String> kode;
    
    @FXML
    private TableColumn<Detail, String> nama;
    
    @FXML
    private TableColumn<Detail, Integer> subTotal;
    
    @FXML
    private TableView<Detail> tbdetail;
    
    @FXML
    private TextField tfHarga;
    
    @FXML
    private TextField tfJml;
    
    @FXML
    private TextField tfNamaBrg;
    
    @FXML
    private TextField tfkodeBrg;

    @FXML
    private TextField tfKodePlg;

    @FXML
    private TextField tfNamaPlg;
    
    @FXML
    void addItem(ActionEvent event) {
        String kode,nama;
        int harga,jml,subTotal;
        kode = tfkodeBrg.getText();
        nama= tfNamaBrg.getText();
        harga=Integer.parseInt(tfHarga.getText()) ;
        jml=Integer.parseInt(tfJml.getText()) ;
        subTotal=harga*jml;
        Detail pd = new Detail(kode,nama,harga,jml,subTotal);
        listPD.add(pd);
        loadTable();
        kosongItem();
    }
    
    @FXML
    void delItem(ActionEvent event) {
        Detail selectedItem = tbdetail.getSelectionModel().getSelectedItem();
        tbdetail.getItems().remove(selectedItem);
    }
    
    @FXML
    void showPlg(ActionEvent event) {
        Stage stage = new Stage();
        Parent root;
        try {
            root = FXMLLoader.load(ProductSearchController.class.getResource("custSearch.fxml"));
            stage.setScene(new Scene(root));
            stage.setTitle("Daftar Pelanggan");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow() );
            stage.showAndWait();
            Pelanggan p ;
            p = (Pelanggan) stage.getUserData();
            tfKodePlg.setText(p.getKode());
            tfNamaPlg.setText(p.getNama());
        } catch(IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    @FXML
    void show(ActionEvent event) {
        Stage stage = new Stage();
        Parent root;
        try {
            root = FXMLLoader.load(ProductSearchController.class.getResource("productSearch.fxml"));
            stage.setScene(new Scene(root));
            stage.setTitle("Daftar Barang");
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow() );
            stage.showAndWait();
            Barang b ;
            b = (Barang) stage.getUserData();
            tfkodeBrg.setText(b.getKode());
            tfNamaBrg.setText(b.getNama());
            tfHarga.setText(String.valueOf(b.getHrg()) ) ;
            tfJml.setText(String.valueOf(b.getStok()));
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void kosongHeader(){
        tfKodePlg.setText("");
        tfNamaPlg.setText("");
        dpTgl.setValue(null);
    }
    void clearDataView(){
        tbdetail.getItems().clear();
    }
    void kosongItem(){
        tfkodeBrg.setText("");
        tfNamaBrg.setText("");
        tfHarga.setText("");
        tfJml.setText("");
    }
    public void setKode(String kode){
        tfkodeBrg.setText(kode);
    }
    void initTabel(){
        kode.setCellValueFactory(new PropertyValueFactory<Detail,String>("kode"));
        nama.setCellValueFactory(new PropertyValueFactory<Detail,String>("nama"));
        harga.setCellValueFactory(new PropertyValueFactory<Detail,Integer>("harga"));
        jml.setCellValueFactory(new PropertyValueFactory<Detail,Integer>("jml"));
        subTotal.setCellValueFactory(new PropertyValueFactory<Detail,Integer>("subTotal"));
    }
    void loadTable(){
        tbdetail.setItems(listPD);
    }

    @FXML
    void simpan(ActionEvent event) {
    try {
        Statement st ;
        Connection conn = Database.connectDB();
        st=conn.createStatement();
        String sql="insert into penjualan (kode_plg,tgl) values ('" + tfKodePlg.getText() + "','" +
        dpTgl.getValue() + "')" ;
        st.executeUpdate(sql);
        sql="select if(max(kode) is null,1,max(kode)+1 )as mkode from penjualan ";
        ResultSet rs= st.executeQuery(sql);
        String kode="";
        while(rs.next()){
            kode=rs.getString("mkode");
        }
        for (Detail d : tbdetail.getItems()) {
        sql="insert into penjualan_detail (kode,kode_brg,hrg,jml) values ('" + kode + "','"+ d.getKode()
       +"','" + String.valueOf(d.getHarga()) + "','" + String.valueOf(d.getJml()) + "')" ;
        st.executeUpdate(sql);
        }
        JOptionPane.showMessageDialog(null, "data berhasil disimpan....");
        kosongHeader();
        clearDataView();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() );
        }
    }
    @FXML
    void batal(ActionEvent event) {
    //Stage stage;
    //stage = (Stage) btnBatal.getScene().getWindow();
    //stage.close();
    exit(0);
    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    initTabel();
    } 


}
