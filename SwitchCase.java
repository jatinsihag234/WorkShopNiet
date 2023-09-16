// SWITCH CASE TO FIND VOWEL OR NOT
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean vowel = false;
        char ch = s.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'u':
            case 'e':
            case 'i':
            case 'o':
            case 'A':
            case 'U':
            case 'E':
            case 'I':
            case 'O': vowel = true;
        }
        if(vowel==true){
            System.out.println("vowel");
        } else {
            System.out.println(ch+" is a Consonant");
        }
    }
}
