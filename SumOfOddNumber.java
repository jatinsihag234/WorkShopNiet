import java.util.Scanner;
public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {2,3,4,5,6,7,9};
        int even = 0;
        int odd = 0;
        for(int i = 0; i< a.length;++i){
            if(i%2==0) {
                even+=a[i];
            }else {
                odd+=a[i];}
        }
        System.out.println("even"+ even);
        System.out.println("odd" + odd);
    }
}
