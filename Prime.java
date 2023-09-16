import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int m = num/2;
        int f = 0;
        if (num==0||num==1){
            System.out.println("Not a prime number.");
        }else{
        for (int i=2;i<=m;i++) {
            if (num % i == 0) {
                System.out.println("Not a prime number");
                f = 1;
                break;
            }
        }
            if (f == 0) {
                System.out.println("It`s a prime number.");
            }


        }}
    }
