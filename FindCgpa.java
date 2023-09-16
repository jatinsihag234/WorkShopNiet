// CGPA OF 5 SUBJECTS
import java.util.Scanner;
public class FindCgpa {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double a = s.nextInt();
    double b = s.nextInt();
    double c = s.nextInt();
    double d = s.nextInt();
    double e = s.nextInt();
    double f = a+b+c+d+e;
    double g = (((f/500)*100)/9.5);
    System.out.println(g);
    }
}
