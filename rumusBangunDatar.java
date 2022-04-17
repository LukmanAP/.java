
import java.util.Scanner;

public class rumusBangunDatar {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       
        
    }

    public static void menu() {
        System.out.print("Masukan Nama Anda : ");
        var nama = scanner.nextLine();
        int pilih = 1;
       do {
            System.out.println("==== MENU ====");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Trapesium");
            System.out.println("5. Layang - Layang");
            System.out.println("6. Belah Ketupat");
            System.out.println("7. Lingkaran");
            System.out.println("8. KELUAR\n\n");

            System.out.print(nama + ", mau pilih no berpa ? : ");
            pilih = scanner.nextInt();
            if (pilih == 1) {
                persegi();
            } else if ( pilih == 2) {
                persegiPanjang();
            } else if ( pilih == 3) {
                segitiga();
            } else if ( pilih == 4) {
                trapesium();
            } else if (pilih == 5) {
                layangLayang();
            } else if (pilih == 6) {
                belahKetupat();
            } else if (pilih == 7) {
                lingkaran();
            } else {
                System.out.println("Input yang anda masukan salah");
            }
        } while (pilih != 8) ; 
    }

    public static void perkenalan() {

        System.out.print("Masukan nama anda : ");
        var nama = scanner.nextLine();

        System.out.println("Haiii ... " + nama);

    }

    public static void persegi() {
        System.out.println("==== Persegi ====");
        System.out.print("Masukan Nilai sisi nya : ");
        var sisi = scanner.nextInt();

        System.out.print("Ingin hitung 1.luas atau 2.keliling (masukan no) : ");
        var pilih = scanner.next().charAt(0);
        if (pilih == '1') {
            int luas = sisi*sisi; // Rumus Hitung Luas
            System.out.println("Hasilnnya adalah : " + luas); 
        } else if ( pilih == '2') {
            int keliling = 4 * sisi; // Rumus hitung keliling
            System.out.println("Hasilnnya adalah : " + keliling);
        } else {
            System.out.println("input salah !");
        }
    }

    public static void persegiPanjang() {
        System.out.println("==== Persegi Panjang ====");
        System.out.print("Masukan nilai panjang : ");
        int panjang = scanner.nextInt();
        System.out.print("Masukan nilai lebar : ");
        int lebar = scanner.nextInt();

        System.out.print("Ingin hitung 1.luas atau 2.keliling (masukan no) : ");
        var pilih = scanner.next().charAt(0);
        if (pilih == '1') {
            int luas = panjang * lebar; //Rumus Hitung Luas
            System.out.println("Hasilnya adalah : " + luas);
        } else if (pilih == '2'){
            int keliling = 2 * (panjang * lebar); // Rumus Hitung Keliling
            System.out.println("Hasilnya adalah : " + keliling);
        } else {
            System.out.println("input salah !");
        }
    }

    public static void segitiga() {
        System.out.println("==== Segitiga ====");
        System.out.print("Ingin hitung 1.luas atau 2.keliling (masukan no) : ");
        var pilih = scanner.next().charAt(0);
        if (pilih == '1') {
            System.out.print("Masukan nilai alas :");
            int alas = scanner.nextInt();
            System.out.print("Masukan nilai tinggi : ");
            int tinggi = scanner.nextInt();
            //Rumus Hitung luas
            int luas = (alas * tinggi)/2;
            System.out.println("Hasilnya adalah : " + luas);
        } else if (pilih == '2'){
            System.out.print("Masukan nilai a :");
            int a = scanner.nextInt();
            System.out.print("Masukan nilai b :");
            int b = scanner.nextInt();
            System.out.print("Masukan nilai c :");
            int c = scanner.nextInt();
            //Rumus Hitung keliling
            int keliling = a + b + c;
            System.out.println("hasilnya adalah :" + keliling);
        } else {
            System.out.println("Input Salah !");
        }
        
    }

    public static void trapesium() {
        System.out.println("==== Trapesium ====");
        System.out.print("Ingin hitung 1.luas atau 2.keliling (masukan no) : ");
        var pilih = scanner.next().charAt(0);
        if (pilih == '1') {
            System.out.print("Masukan Nilai Atas : ");
            int atas = scanner.nextInt();
            System.out.print("Masukan Nilai bawah : ");
            int bawah = scanner.nextInt();
            System.out.print("Masukan Nilai tinggi : ");
            int tinggi = scanner.nextInt();
            //rumus luas Trapesium
            int luas = ((atas+bawah)*tinggi)/2;
            System.out.println("Hasailnya adalah : " + luas);
        } else if (pilih == '2') {
            System.out.println("pertama anda berikan nilai pada setiap sudut dengan huruf A B C dan D");
            System.out.print("Masukan Nilai dari A ke B : ");
            int AB = scanner.nextInt();
            System.out.print("Masukan Nilai dari B ke C : ");
            int BC = scanner.nextInt();
            System.out.print("Masukan Nilai dari C ke D : ");
            int CD = scanner.nextInt();
            System.out.print("Masukan Nilai dari D ke A : " );
            int DA = scanner.nextInt();

            //rumus hitung keliling trapeium
            int keliling = AB + BC + CD + DA;
            System.out.println("hasilnya adalah : " + keliling);
        } else {
            System.out.println("Input Salah !");
        }
    }


    public static void layangLayang() {
        System.out.println("==== Layang - Layang ====");
        System.out.print("Ingin hitung 1.luas atau 2.keliling (masukan no) : ");
        var pilih = scanner.next().charAt(0);
        if (pilih == '1' ) {
            System.out.print("Masukan panjang lengan :");
            int lengan = scanner.nextInt();
            System.out.print("Masukan panjang badan : ");
            int badan = scanner.nextInt();

            //Rumus hitung luas layang"
            int luas = (lengan * badan)/2;
            System.out.println("hasilnya adalah : " + luas);
        } else if (pilih == '2') {
            System.out.print("Masukan sisi atas : ");
            int atas = scanner.nextInt();
            System.out.println("Masukan sisi bawah : ");
            int bawah = scanner.nextInt();

            //Rumus hitung keliling layang2
            int keliling = 2 * (atas + bawah);
            System.out.println("Hasilnya adalah : " + keliling);
        } else {
            System.out.println("Input yang anda masukan salah");
        }

    }

    public static void belahKetupat() {
        System.out.println("==== Belah ketupat ====");
        System.out.print("Ingin hitung 1.luas atau 2.keliling (masukan no) : ");
        var pilih = scanner.next().charAt(0);
        System.out.print("Masukan Panjang sisi : ");
        int sisi = scanner.nextInt();
        System.out.print("Masukan panjang dari sudut ke sudut 1 :  ");
        int sudut1 = scanner.nextInt();
        System.out.print("Masukan panjang dari sudut ke sudut 2 :  ");
        int sudut2 = scanner.nextInt();
        if (pilih == '1') {
            var luas = (sudut1*sudut2)/2; // rumus belah ketupat
            System.out.println("Hasilny adalah : " + luas);
        } else if (pilih == '2') {
            var keliling = 4 * sisi ;
            System.out.println("hasilnya adalah : " + keliling);
        } else {
            System.out.println("input yang anda masukan salah !");
        }
    }

    public static void lingkaran() {
        System.out.println("==== Lingkaran ====");
        System.out.print("Ingin hitung 1.luas atau 2.keliling (masukan no) : ");
        var pilih = scanner.next().charAt(0);
        System.out.print("Masukan Nilai diameter : ");
        var diameter = scanner.nextInt();
        if (pilih == '1') {
            var jari = diameter/2 ; 
            var luas = 3.14 * jari * jari; // Rumus Luas Lingkaran
            System.out.println("Hasilnya adalah : " + luas);
        } else if (pilih == '2') {
            var keliling = 3.14 * diameter; // Rumus Keliling Lingkaran
            System.out.println("Hasilnya adalah : " + keliling);
        }
    } 





}
