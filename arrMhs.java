import java.util.Scanner;

public class arrMhs {
    public static void main(String[] args) {
        mhs[] arrMhs = new mhs[3];

        isiArray(arrMhs);
        printArray(arrMhs);

    }

    static void isiArray(mhs[] A) {
        Scanner scanner = new Scanner(System.in);
        String nim = "";
        String nama = "";
        float ipk = 0.0f;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Nim ke-" + i + " : ");
            nim = scanner.next();
            System.out.print("Nama ke-" + i + " : ");
            nama = scanner.next();
            System.out.print("IPK ke-" + i + " : ");
            ipk = scanner.nextFloat();

            mhs MHS = new mhs(nim, nama, ipk);
            A[i] = MHS;

            System.out.println("");
        }
    }

    static void printArray(mhs[] A) {

        System.out.println("-------hasil----------");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i].nim + "\t" + A[i].nama + "\t" + A[i].ipk + "\n");
        }
    }
}
