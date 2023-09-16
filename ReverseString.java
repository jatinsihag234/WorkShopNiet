public class ReverseString {
    public static void main(String[] args) {
        String originalStr ="hello java";
        String words[] = originalStr.split("\\s");
        String reversedString = "";

        for (int i = 0; i < words.length; i++)
        {
            if(i== words.length-1){
                reversedString = words[i]+reversedString;
            }else {
                reversedString= " "+ words[i]+reversedString;
            }
        }
          //  String word = words[i];
       //     String reverseWord = "";
       //     for (int j = word.length() - 1; j >= 0; j--) {
                //reverseWord = reverseWord + word.charAt(j);
       //     }
          //  reversedString = reversedString + reverseWord + " ";
    //    }
        System.out.println(reversedString);
    }
}

