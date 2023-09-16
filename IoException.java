import javax.imageio.IIOException;
import java.io.File;
//import java.util.File;
import java.io.IOException;
public class IoException {
    public static void main(String[] args) {
        try {

            File f0 = new File("D:FileOperationExample.txt");

            if (f0.createNewFile()) {
                System.out.println("file" + f0.getName() + "is created successfully");

            } else {
                System.out.println("file already exist");
            }
        }catch (IOException exception){
            System.out.println("unexpoected error");
            exception.printStackTrace();
        }
    }
}
