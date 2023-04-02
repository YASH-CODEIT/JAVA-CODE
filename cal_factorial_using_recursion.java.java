import java.util.Scanner;
class Main{
    public static void calFactorial(int n,int m,int fact){
        if(m==n){
            fact=fact*m;
            System.out.println("The factorial of "+n+" is :"+fact);
            return;
        }
        fact=fact*m;
        calFactorial(n,m+1,fact);
    }
    public static void main(String[] args){
        int n,m=1,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n to find its Factorial: ");
        n=sc.nextInt();
        calFactorial(n,m+1,fact);
    }
}