
public class checkvowel {
    static boolean checkvowel (char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String x = "niet";
        StringBuffer sb1 = new StringBuffer(x);
        int str1 = sb1.length();
        for(int i = 0 ; i<str1;i++){
            char c = sb1.charAt(i);
            if(checkvowel(c)) {
                continue;
            } else{
                System.out.println("no");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
