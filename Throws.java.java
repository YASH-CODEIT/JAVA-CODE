import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class Test{
    void readFile() throws FileNotFoundException{
        FileInputStream fr=new FileInputStream("D://abc.txt");
    }
    void inputFile() throws FileNotFoundException{
    String str="Hello World";
        FileOutputStream fo=new FileOutputStream("D://xyz.txt");
    }
}

public class Throws {
    public static void main(String []args){
        Test t=new Test();
        try {
            t.readFile();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        try{
            t.inputFile();
        }
        catch(FileNotFoundException e1){
            e1.printStackTrace();
        }
    }

}
