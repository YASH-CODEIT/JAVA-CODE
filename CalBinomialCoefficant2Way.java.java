import java.util.Scanner;
class Main{
    public static int   Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int BinomialCoefficent(int n,int r){
        int n_fact,r_fact,n_rfact;
        n_fact=Factorial(n);
        r_fact=Factorial(r);
        n_rfact=Factorial(n-r);
        return n_fact/(r_fact*n_rfact);
    }
    public static void main(String []args){
        int n,r,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        System.out.println("Enter the value of r: ");
        r=sc.nextInt();
        result=BinomialCoefficent(n,r);
        System.out.println("The Binomial Coefficient is : "+result);

    }
}