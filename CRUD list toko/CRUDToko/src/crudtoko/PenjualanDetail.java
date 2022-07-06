package crudtoko;

import javafx.scene.control.TableColumn;

public class PenjualanDetail {
    private String kode;
    private Barang brg;
    private int jml;
    
    public PenjualanDetail(Barang brg, int jml,String kode) {
        this.brg = brg;
        this.jml = jml;
        this.kode = kode;
    }
    public String getKode(){
        return kode;
    }
    public void setKode(String kode){
        this.kode=kode;
    }

    public int getSubTotal(){
        // return brg.getHarga()* jml;
        return 0;
    }
    public int getJml() {
        return jml;
    }
    public void setJml(int jml) {
        this.jml = jml;
    }
    public Barang getBrg() {
        return brg;
    }
    public void setBrg(Barang brg) {
        this.brg = brg;
    }


}
