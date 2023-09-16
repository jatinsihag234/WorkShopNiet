//movie wala code
import java.util.Scanner;
public class Chief {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();;
        int b = s.nextInt();
        System.out.println(a+" " +b);
        if(b%2==0){
            b=b/2;
            System.out.println(a-b);
        }else {
            System.out.println("i entered a odd miniute");
        }
    }
}
