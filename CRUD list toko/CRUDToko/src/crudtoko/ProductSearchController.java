package crudtoko;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ProductSearchController implements Initializable {
    Stage stage;
    ObservableList<Barang> listBrg = FXCollections.observableArrayList() ;
    //ObservableList<Barang> listBrg ;

    @FXML
    private Button btnPilih;

    @FXML
    private TableColumn<Barang, Integer> hrg;
    
    @FXML
    private TableColumn<Barang, String> kode;
    
    @FXML
    private TableColumn<Barang, String> nama;
    
    @FXML
    private TableView<Barang> tbbarang;


    @FXML
    private TextField tfKeyword;

    @FXML
    void pilih(ActionEvent event) {
        stage = (Stage) btnPilih.getScene().getWindow();
        Barang b= tbbarang.getSelectionModel().getSelectedItem();
        //b.setKode(tfkode.getText());
        stage.setUserData(b);
        stage.close();
    }
    
    void initTabel(){
        kode.setCellValueFactory(new PropertyValueFactory<>("kode"));
        nama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        hrg.setCellValueFactory(new PropertyValueFactory<>("hrg"));
    }
    void loadData(){
        listBrg= Database.getDataMhs();
        tbbarang.setItems(listBrg);
    }
    
    void setFilter(){
    FilteredList<Barang> filterData= new FilteredList<>(listBrg,b->true);
    tfKeyword.textProperty().addListener((observable,oldValue,newValue)->{
    filterData.setPredicate(Barang->{
        if (newValue.isEmpty() || newValue==null){
            return true;
        }
    String searchKeyword=newValue.toLowerCase();
    if (Barang.getNama().toLowerCase().indexOf(searchKeyword)> -1){
        return true;
    }else if (Barang.getKode().toLowerCase().indexOf(searchKeyword)>-1){
        return true;
    }else
        return false;
    });
    });
    SortedList<Barang> sortedData = new SortedList<>(filterData);
    sortedData.comparatorProperty().bind(tbbarang.comparatorProperty());
    tbbarang.setItems(sortedData);
    }
    
    @FXML
        void pilihProduk(MouseEvent event) {
        //Barang b= tbbarang.getSelectionModel().getSelectedItem();
        //tfkode.setText(b.getKode());
        //MHS m = tbmhs.getSelectionModel().getSelectedItem();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initTabel();
        loadData();
        setFilter();
    } 
}
