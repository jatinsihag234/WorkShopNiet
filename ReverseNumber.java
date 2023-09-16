import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int reverse = 0;
        int reminder ;
        while (a!=0){
            reminder = a%10;
            reverse = reverse *10 + reminder;
            a/= 10;
        }
        System.out.println(reverse);
    }
}
