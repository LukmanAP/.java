package crudtoko;

public class Pelanggan {
    private String kode;
    private String nama;
    private String email;
    private String telp;
    
    
    public Pelanggan(String kode, String nama, String email, String telp) {
        this.kode = kode;
        this.nama = nama;
        this.email = email;
        this.telp = telp;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelp() {
        return telp;
    }
    public void setTelp(String telp) {
        this.telp = telp;
    }

}
