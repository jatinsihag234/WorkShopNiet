public class CommandLine {
    public static void main(String[] args) {
        String str = args[0];
        int n = Integer.parseInt(str);
        for(int i = 0; i<str.length(); i++){
            String symbol = (i % 2 == 0) ? "+" : "-";
            System.out.println(symbol + args[n]);


        }
      //  System.out.println(n);

    }
}
