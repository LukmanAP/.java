package crudtoko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Database {
    //Connection conn=null;
    public static Connection connectDB() throws SQLException {
        String user="root";
        String password="";
        String url="jdbc:mysql://localhost:3306/dbjava";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,user,password);
            if (c!=null)
                System.out.println("Koneksi berhasil");
            else
                System.out.println("Koneksi gagal..");
            return c; 
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static ObservableList<Barang> getDataMhs(){
        ObservableList<Barang> listBrg = FXCollections.observableArrayList();
        //Statement st ;
        try {
            Connection c = connectDB();
            String sql="select * from barang";
            PreparedStatement ps =c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Barang m = new Barang(rs.getString("kode"),rs.getString("nama"),rs.getInt("hrg"));
                listBrg.add(m);
            }
            return listBrg;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    public static ObservableList<Pelanggan> getDataPlg(){
        ObservableList<Pelanggan> listPlg = FXCollections.observableArrayList();
        //Statement st ;
        try {
            Connection c = connectDB();
            String sql="select * from pelanggan";
            PreparedStatement ps =c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Pelanggan p = new
                Pelanggan(rs.getString("kode"),rs.getString("nama"),rs.getString("email"),rs.getString("telp"));
                listPlg.add(p);
            }
            return listPlg;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
