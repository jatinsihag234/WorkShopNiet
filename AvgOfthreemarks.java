// find avg of 3 marks and pass or fail
import java.util.Scanner;
public class AvgOfthreemarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = a + b + c;
        int e = d / 3;
        System.out.println(e);
        if (a >= 40 ) {
            System.out.println("a is pass");
        }
        else {
            System.out.println("a is fail");
        }
        if (b>=40 ){
            System.out.println("b is pass");
        }
        else {
            System.out.println("b is fail");
        }
        if (c>=40){
            System.out.println("c is pass");
        }
        else {
            System.out.println("c is fail");
        }
    }
}
