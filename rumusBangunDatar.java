
import java.util.Scanner;

public class rumusBangunDatar {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        
        
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
        System.out.println("==== Trapesium ====");
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





}
