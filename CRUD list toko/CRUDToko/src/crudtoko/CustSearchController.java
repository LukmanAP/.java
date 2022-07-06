package crudtoko;

import crudtoko.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;
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

public class CustSearchController implements Initializable {
    Stage stage;
    ObservableList<Pelanggan> listPlg = FXCollections.observableArrayList() ;
    @FXML
    private Button btnPilih;
    
    @FXML
    private TableColumn<Pelanggan, String> email;
    
    @FXML
    private TableColumn<Pelanggan, String> kode;
    
    @FXML
    private TableColumn<Pelanggan, String> nama;
    
    @FXML
    private TableView<Pelanggan> tbpelanggan;
    
    @FXML
    private TableColumn<Pelanggan, String> telp;
    
    @FXML
    private TextField tfKeyword;

    @FXML
    private Button btnBatal;

    @FXML
    private Button btnSimpan;
    
    @FXML
    void pilih(ActionEvent event) {
        stage = (Stage) btnPilih.getScene().getWindow();
        Pelanggan p= tbpelanggan.getSelectionModel().getSelectedItem();
        stage.setUserData(p);
        stage.close();
    }
    
    @FXML
    void pilihPelanggan(MouseEvent event) {
        //Pelanggan p= tbpelanggan.getSelectionModel().getSelectedItem();
    }  
    
    void initTabel(){
        kode.setCellValueFactory(new PropertyValueFactory<>("kode"));
        nama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));
        telp.setCellValueFactory(new PropertyValueFactory<>("telp"));
    }
    void loadData(){
        listPlg= Database.getDataPlg();
        tbpelanggan.setItems(listPlg);
    }
    void setFilter(){
    FilteredList<Pelanggan> filterData= new FilteredList<>(listPlg,b->true);
    tfKeyword.textProperty().addListener((observable,oldValue,newValue)->{
    filterData.setPredicate(Pelanggan->{
        if (newValue.isEmpty() || newValue==null){
            return true;
        }
    String searchKeyword=newValue.toLowerCase();
    if (Pelanggan.getNama().toLowerCase().indexOf(searchKeyword)> -1){
        return true;
    }else if (Pelanggan.getKode().toLowerCase().indexOf(searchKeyword)>-1){
        return true;
    }else
        return false;
    });
    });
    SortedList<Pelanggan> sortedData = new SortedList<>(filterData);
    sortedData.comparatorProperty().bind(tbpelanggan.comparatorProperty());
    tbpelanggan.setItems(sortedData);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       initTabel();
       loadData();
       setFilter();
    } 
}
