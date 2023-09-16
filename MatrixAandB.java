import java.lang.reflect.Array;
import java.util.Scanner;
public class MatrixAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(); // raw of first matrix
        int q = sc.nextInt(); // coloum of 1 st matrix
        int m = sc.nextInt(); // raw of 2 nd matrix
        int n = sc.nextInt(); // coloum of 2nd matrix
        if (p == m && q == n) {
            int a[][] = new int[p][q];
            int b[][] = new int[m][n];
            int c[][] = new int[m][n];
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            //Initialize the second matrix
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            System.out.println("First Matrix:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println("");
            }
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < q; k++) {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            System.out.println("Matrix after addition:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Addition not possible");
            System.out.println("Try Again");
        }
    }
}
