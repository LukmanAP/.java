import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        /*
         * int[] arrInt = new int[4];
         * arrInt[0] = 4;
         * arrInt[1] = 6;
         * arrInt[2] = 8;
         * arrInt[3] = 2;
         * 
         * for (int i = 0; i < arrInt.length; i++) {
         * System.out.println("elemet ke " + i + " : " + arrInt[i]);
         * }
         * 
         * System.out.println("-------------------------------");
         * 
         * int array2[] = { 4, 3, 6, 2, 1 };
         * for (int b = 0; b < array2.length; b++) {
         * System.out.println("elemet ke-" + b + " : " + array2[b]);
         * }
         */
        int[] arrInt = new int[4];
        String[] arrMhs = new String[5];

        // array(arrInt);
        array(arrMhs);

    }

    static void array(int[] arr) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("element ke-" + i + " : ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("elemet ke-" + i + " : " + arr[i]);
        }
    }

    static void array(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukan nama ke-" + i + " : ");
            arr[i] = scanner.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element ke-" + i + " : " + arr[i]);
        }
    }
}