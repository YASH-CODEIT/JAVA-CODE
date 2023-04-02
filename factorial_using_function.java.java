import java.util.Scanner;
import java.util.Scanner;
public class Main {
   public static int findFactorial(int n){
       int fact=1;
       for(int i=n;i>=1;i--){
           fact = fact*i;
       }
       return fact;
   }
    public static void main(String[] args) {
      int n;
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to find its Factorial: ");
         n=sc.nextInt();
         if(n<0){
             System.out.println("We cannot find the factorial of nNegative no");
         }
         else {
             System.out.println("The factorial is: " + findFactorial(n));
         }
    }
}