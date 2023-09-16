import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int raw = sc.nextInt();
        int coloum = sc.nextInt();
        for (raw = 0; raw < coloum ; raw++) {
            for (coloum = 0; coloum <= raw; coloum++) {
                System.out.print("* ");
            }
            System.out.println();


        }

    }
}
