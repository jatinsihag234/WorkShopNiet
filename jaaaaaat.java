import java.util.Scanner;
public class jaaaaaat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {

            int a = s.nextInt();
            int b = s.nextInt();
            int c = a + b;

        }catch (NumberFormatException e){
            
            System.out.println(e);
        }

    }
}
