import java.io.File;
import  java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class ReadFile {
    public static void main(String []args) {

            File f = new File("d://abc.txt");
            try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String data=sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch(FileNotFoundException e1){
            System.out.println("Error occurred: ");
            e1.printStackTrace();
        }

    }
}
