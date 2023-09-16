import static java.util.Collections.swap;

/* revserse a string*/
public class ReverseAstring {
    public static void main (String[] args) {
        String str1 = "jatin";
        String str2 = "";
        for (int i = 0; i < str1.length();i++) {
            char ch = str1.charAt(i);
            str2 = ch+str2;
        }
        System.out.println(str2);
    }
}
