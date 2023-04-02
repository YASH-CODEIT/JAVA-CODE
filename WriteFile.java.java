import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String []args){
        try {
            File f = new File("d://abc.txt");
            FileWriter write = new FileWriter(f);
            write.write("Hello World \n  This is second Line");
            System.out.println("SuccessFully Write!!");
            write.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
