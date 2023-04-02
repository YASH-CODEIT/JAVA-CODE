import java.util.Scanner;
class Main{
    public static boolean CheckPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void RangeValue(int n){
        boolean result;
        if(n==1){
            System.out.println("2");
            return;
        }
        int count=0;
        for(int i=2;i>0;i++){
             if(CheckPrime(i)){
                 System.out.print(i+" ");
                 count++;
             }
             if(count==n){
                 return;
             }
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("The first "+n+" prime no is: ");
        RangeValue(n);
    }
}