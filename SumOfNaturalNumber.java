// sum of n. numbers
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum = 0;
        for (int i = 0; i <= a; ++i) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
