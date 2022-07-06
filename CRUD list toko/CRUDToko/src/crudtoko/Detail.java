package crudtoko;

public class Detail {
    private String kode;
    private String nama;
    private int harga;
    private int jml;
    private int subTotal;
    
    public Detail(String kode,String nama, int harga, int jml, int subTotal) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jml = jml;
        this.subTotal = subTotal;
    }
    public int getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getJml() {
        return jml;
    }
    public void setJml(int jml) {
        this.jml = jml;
    }
}
