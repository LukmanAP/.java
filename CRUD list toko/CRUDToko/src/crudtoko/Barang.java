package crudtoko;

public class Barang {
    private String nama;
    private String satuan;
    private int hrg;
    private int stok;
    private String kode;
    public Barang(){
    //nothing
    }
    
    public Barang(String kode,String nama, int hrg) {
        this.nama = nama;
        this.hrg = hrg;
        this.kode = kode;
    }
    public Barang(String nama, String satuan, int hrg, int stok, String kode) {
        this.nama = nama;
        this.satuan = satuan;
        this.hrg = hrg;
        this.stok = stok;
        this.kode = kode;
    }
     
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getSatuan() {
        return satuan;
    }
    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }
    public int getHrg() {
        return hrg;
    }
    public void setHrg(int hrg) {
        this.hrg = hrg;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    } 
     
     



}
