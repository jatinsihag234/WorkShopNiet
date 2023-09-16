import java.util.Scanner;
public class SumOfElementtIn2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int j = s.nextInt();
        int  r = 0;
        int x[][] = {{1,2,3},{3,4,5},{6,7,8}};
        for (int a = 0 ; a< x.length;a++){
           // x[a][a]= s.nextInt();
            System.out.println(x[i][j]);
        }
    }

}
