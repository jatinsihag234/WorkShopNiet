import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFromFile {
    public static void main(String[] args)  {
        try {
            File f1 = new File("D.FileOperationExample.txt");
            Scanner dataReader = new Scanner(System.in);
            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();
        }catch (NumberFormatException e){
            System.out.println(e);
        }

    }
}
