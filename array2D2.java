import java.util.Scanner;

public class array2D2 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[4][2];

        isiArray(matrix1);
        prinitArray(matrix1);

    }

    static void isiArray(int[][] A) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Matrix (" + i + "," + j + ") : ");
                A[i][j] = scanner.nextInt();
            }
        }
    }

    static void prinitArray(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}