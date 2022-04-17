public class mhs {
    String nim;
    String nama;
    float ipk;

    mhs() {
        nim = "";
        nama = "";
        ipk = 0f;
    }

    mhs(String nim, String nama, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = 3.6f;
    }

    void printInfo() {
        System.out.println("NIM : " + nim);
        System.out.println("nama : " + nama);
        System.out.println("IPK : " + ipk);
    }

}
