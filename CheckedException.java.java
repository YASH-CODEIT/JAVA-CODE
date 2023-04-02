import java.io.FileInputStream;

public class CheckedException {
    public static void main(String []args) {
    try{
         int a=110;
         int b=0;
         int c=a/b;
         System.out.println("Division");
     }
     catch(ArithmeticException e){
         e.printStackTrace();
         System.out.println(e.toString());
         System.out.println(e.getMessage());
     }
        finally{
            System.out.println("Yah");
        }
    }
}
