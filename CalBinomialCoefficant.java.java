import java.util.Scanner;
class Main{
    public static int CalFactorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String []args){
        int n,r,r1,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        System.out.println("Enter the value of r: ");
        r=sc.nextInt();
        r1=CalFactorial(n-r);
        n=CalFactorial(n);
        r=CalFactorial(r);
        result=((n)/(r*r1));
        System.out.println("The Binomial Coefficient is: "+result);
    }
}