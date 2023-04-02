import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String []args){
        File obj=new File("d://abc.txt");
        try {
            if (obj.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File is not created");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
