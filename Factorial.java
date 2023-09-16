//factorial of a number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int factorial = 1;
        for(int i = 1;i<=a ; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        
    }
}
