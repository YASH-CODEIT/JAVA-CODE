import java.util.Scanner;
class Main{
 public static boolean CheckPrime(int n){
     if(n==2){
         return true;
     }
     for(int i=2;i<=Math.sqrt(n);i++){
         if(n%i==0){
             return false;
         }
     }
     return true;
 }
    public static void main(String []args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n to check whether it is prime or not : ");
        n=sc.nextInt();
        System.out.println(CheckPrime(n));

    }
}