//GREATER IN THREE NUMBER
import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a > b & b > c) {
            System.out.println("a is greater");
        } else if (b > c) {
            System.out.println("b is greater ");
        } else{
            System.out.println("c is greater");
        }
        }
    }
