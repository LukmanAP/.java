import java.util.Scanner;


public class deretFibonaci {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n, fn, fn1, fn2;

        System.out.println("== Program deret fibonaci ==");
        System.out.print("Masukan nilai ke-n yang anda inginkan : ");
        n = scanner.nextInt();

        fn1 = 1;
        fn2 = 0;
        
        System.out.print(" ");
        System.out.print(" ");

        for (int i = 1; i < n; i++) {
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
            System.out.print(fn + " ");
        }
        System.out.println("\n");
    }
    
}
