import java.util.Scanner;
class Main{
    public static void printSum(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
     sum=sum+n;
        printSum(n-1,sum);
    }
    public static void main(String[] args){
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n to finds its sum: ");
        n=sc.nextInt();
        System.out.println("The sum of "+n+" natural no is: ");
        printSum(n,sum);
    }
}