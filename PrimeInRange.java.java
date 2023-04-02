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
        if(n==2){
            System.out.println("2");
            return;
        }
        for(int i=2;i<=n;i++){
             result=CheckPrime(i);
            if(result){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("The prime no from 1 to "+n+" is : ");
        RangeValue(n);
    }
}