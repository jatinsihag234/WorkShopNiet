import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter fwrite = new FileWriter("D:FileOperationExample.txt");
            fwrite.write("a named locatoion used to store related info is refered to as a file");
            // File.Opera
            fwrite.close();
            System.out.println("content is successfuklly wrote tto the file");
        }catch (IOException e){
            System.out.println("Unexpected error occured");
            e.printStackTrace();
        }
    }
}