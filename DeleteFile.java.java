import java.io.File;
public class DeleteFile {
    public static void main(String []args){
        File obj=new File("d://abc.txt");
        if(obj.delete()){
            System.out.println("File is deleted");
        }
        else{
            System.out.println("File is not delete");
        }
    }
}
