import java.util.Scanner;
public class Main {
   public static void findPrimeNo(int n){
       int count=0;
       for(int i=1;i<=n;i++) {
           if (n % i == 0) {
               count++;
           }
       }
           if(count==2){
               System.out.println("It is a prime No");
       }
           else{
               System.out.println("It is not a prime No");
           }
   }
    public static void main(String[] args) {
      int n;
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to find whether it's prime or not: ");
         n=sc.nextInt();
         findPrimeNo(n);
    }
}