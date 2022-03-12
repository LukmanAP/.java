
import java.util.Scanner;

public class segitigaBintang {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        
            System.out.println("==== MENU ====");
            System.out.println("1. segitiga sudut kiri bawah");
            System.out.println("2. segitiga sudut kiri atas");
            System.out.println("3. segitiga sudut kanan bawah");
            System.out.println("4. segitiga sudut kanan atas");
            System.out.println("5. segitiga sudut bawah");
            System.out.println("6. segitiga sudut atas");
            System.out.println("x. keluar");

        boolean nilai = true;    
        while (nilai) {
            Character no ;
            var jumlah = 0;
            
            System.out.print("Kalian ingin melihat no berapa ? : ");
            no = scanner.next().charAt(0);

            if (no == '1') {
                System.out.print("Masukan Jumlah Panjang : ");
                jumlah = scanner.nextInt();
                segitigaKiriBawah(jumlah);
            } else if (no == '2') {
                System.out.print("Masukan Jumlah Panjang : ");
                jumlah = scanner.nextInt();
                segitigaKiriAtas(jumlah);
            } else if (no == '3') {
                System.out.print("Masukan Jumlah Panjang : ");
                jumlah = scanner.nextInt();
                segitigaKananBawah(jumlah);
            } else if (no == '4') {
                System.out.print("Masukan Jumlah Panjang : ");
                jumlah = scanner.nextInt();
                segitigaKananAtas(jumlah);
            } else if (no == '5') {
                System.out.print("Masukan Jumlah Panjang : ");
                jumlah = scanner.nextInt();
                segitigaUjungBawah(jumlah);
            } else if (no == '6') {
                System.out.print("Masukan Jumlah Panjang : ");
                jumlah = scanner.nextInt();
                segitigaUjungAtas(jumlah);
            } else if (no == 'x') {
                nilai = false;
            } else {
                System.out.println("nilai yang anda masukin salah\n\n");
            }
            
/*
            switch (no) 
            {
                case "1":
                    System.out.print("Masukan Jumlah Panjang : ");
                    jumlah = scanner.nextInt();
                    segitigaKiriBawah(jumlah); break;
                case "2":
                    System.out.print("Masukan Jumlah Panjang : ");
                    jumlah = scanner.nextInt();
                    segitigaKiriAtas(jumlah); break;
                case "3":
                    System.out.print("Masukan Jumlah Panjang : ");
                    jumlah = scanner.nextInt();
                    segitigaKananBawah(jumlah); break;
                case "4":
                    System.out.print("Masukan Jumlah Panjang : ");
                    jumlah = scanner.nextInt();
                    segitigaKananAtas(jumlah); break;
                case "5":
                    System.out.print("Masukan Jumlah Panjang : ");
                    jumlah = scanner.nextInt();
                    segitigaUjungBawah(jumlah); break;
                case "6":
                    System.out.print("Masukan Jumlah Panjang : ");
                    jumlah = scanner.nextInt();
                    segitigaUjungAtas(jumlah); break;
                case "x": 
                    nilai = false;
                    break;
                default :
                    System.out.println("Input yang anda masukan salah");
            }
            
*/




            //String x = null;
            //x = scanner.nextLine();
        }
    }


    public static void segitigaKiriBawah(int jumlah) {
        
        System.out.println("=== Pola satu ===");

        for (var i = 0; i < jumlah; i++ ) {
            for (var j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void segitigaKiriAtas(int jumlah) {
        System.out.println("=== Pola dua ===");

        var jumlah1 = jumlah;
        for (var i = 0; i < jumlah; i++) {
            for (var j = jumlah1; j > 0 ; j--) {
                System.out.print("* ");
            }
            jumlah1--;
            System.out.println();
        }
    }

    public static void segitigaKananBawah(int jumlah) {
        System.out.println("=== Pola tiga ===");

        var jumlah1 = jumlah-1;
        for (var i = 0; i < jumlah; i++) {
            for (var j = jumlah1; j > 0 ; j--) {
                System.out.print("  ");
            }
            for (var m = 0; m <= i; m++) {
                System.out.print("* ");
            }
            System.out.println();
            jumlah1--;
        }
    }

    public static void segitigaKananAtas(int jumlah) {
        System.out.println("=== Pola empat ===");

        var jumlah1 = jumlah;
        for (var i = 0; i < jumlah; i++) {
            for (var j = 0; j < i ; j++){
                System.out.print("  ");
            }
            for (int k = jumlah1; k >= 1; k--) {
                System.out.print("* ");
            }
            jumlah1--;
            System.out.println();
        }
    }

    public static void segitigaUjungAtas(int jumlah) {
        System.out.println("=== Pola lima ===");

        var jumlah1 = jumlah-1;
        for (var i = 0; i < jumlah; i++) {
            for (var j = jumlah1; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (var m = 0; m <= i; m++) {
                System.out.print("* ");
            }
            System.out.println();
            jumlah1--;
        }
    }

    public static void segitigaUjungBawah( int jumlah) {
        System.out.println("=== Pola enam ===");

        var jumlah1 = jumlah;
        for (var i = 0; i < jumlah; i++) {
            for (var j = 0; j < i ; j++){
                System.out.print(" ");
            }
            for (int k = jumlah1; k >= 1; k--) {
                System.out.print("* ");
            }
            jumlah1--;
            System.out.println();
        }
    }

    





}