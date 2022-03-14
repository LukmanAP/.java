import java.util.Scanner;


public class bubleShort {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        var nilai = true;
        boolean nilai1 = true;
        while (nilai == nilai1) {
        System.out.println("==== Menu ====");
            System.out.println("1. Urutkan Nilai dari yang terkecil ke yang terbesar");
            System.out.println("2. Urutkan Nilai dari yang terbesar ke yang terkecil");
            System.out.println("x. Keluar");

            System.out.print("Anda Mau yang mana (masukan no) : ");
            char no = scanner.next().charAt(0);       
        
            if ( no == '1') {
                bubleShortDariTerkecil(input());
            } else if ( no == '2') {
                bubleShortDariTerbesar(input());
            } else if ( no == 'x') {
                nilai1 = false; 
            } else {
                System.out.println("Input Salah !");
            }

        System.out.println("");
        }
        
    }

    public static int[] input() {
        System.out.print("masukan Berapa banyak angka yang ingin anda tampung : ");
        int isi = scanner.nextInt();
        int[] data = new int[isi];

        for (int i = 0; i < data.length; i++) {
            int angka = 0 ;
            System.out.print("Masukan angka pada kotak ke-"+ (i+1) + " : ");
            angka = scanner.nextInt();
            data[i] = angka;
        }
        return data;
    }


    public static void bubleShortDariTerkecil(int data[]) {
        

        for ( int a = 0 ; a < data.length; a++) {
            for (int i = 0; i < data.length-1; i++) {
                boolean isi = data[i] < data[i+1];
                if (!isi) {
                    int baru = data[i];
                    data[i] = data[i+1];
                    data[i+1] = baru;
                }                
            }
        }
        System.out.println("Hasil urut nya selalu dari terendah ke tertinggi");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
    }

    
    public static void bubleShortDariTerbesar(int data[]) {


        for ( int a = 0 ; a < data.length; a++) {
            for (int i = 0; i < data.length-1; i++) {
                boolean isi = data[i] > data[i+1];
                if (!isi) {
                    int baru = data[i];
                    data[i] = data[i+1];
                    data[i+1] = baru;
                }                
            }
        }
        System.out.println("Hasil urut nya selalu dari terendah ke tertinggi");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
    }
}



/**
 * // Contoh Penggunaan
 * 
 * 
 1. {
    ==== Menu ====
    1. Urutkan Nilai dari yang terkecil ke yang terbesar
    2. Urutkan Nilai dari yang terbesar ke yang terkecil
    x. Keluar
    Anda Mau yang mana (masukan no) : 1
    masukan Berapa banyak angka yang ingin anda tampung : 3
    Masukan angka pada kotak ke-1 : 3
    Masukan angka pada kotak ke-2 : 2
    Masukan angka pada kotak ke-3 : 1
    Hasil urut nya selalu dari terendah ke tertinggi    
    1, 2, 3, 
}

2. {
    ==== Menu ====
    1. Urutkan Nilai dari yang terkecil ke yang terbesar
    2. Urutkan Nilai dari yang terbesar ke yang terkecil
    x. Keluar
    Anda Mau yang mana (masukan no) : 2
    masukan Berapa banyak angka yang ingin anda tampung : 6
    Masukan angka pada kotak ke-1 : 1
    Masukan angka pada kotak ke-2 : 2
    Masukan angka pada kotak ke-3 : 3
    Masukan angka pada kotak ke-4 : 4
    Masukan angka pada kotak ke-5 : 5
    Masukan angka pada kotak ke-6 : 6
    Hasil urut nya selalu dari terendah ke tertinggi    
    6, 5, 4, 3, 2, 1, 
}

3. {
    ==== Menu ====
    1. Urutkan Nilai dari yang terkecil ke yang terbesar
    2. Urutkan Nilai dari yang terbesar ke yang terkecil    
    x. Keluar
    Anda Mau yang mana (masukan no) : x
}


PS D:\My Drive\github\java> 


 */