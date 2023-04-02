import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String []args){
        int n,n1,n2,r,r1=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of digit in a number: ");
        n=sc.nextInt();
        System.out.println("Enter the no: ");
        n1=sc.nextInt();
        n2=n1;
        while(n1>0){
            r=n1%10;
            n1=n1/10;
            r1+=Math.pow(r,n);
        }
        if(r1==n2)
            System.out.println("It is a armstrong no.");
            else
            System.out.println("It is not a armstrong no.");
    }
}