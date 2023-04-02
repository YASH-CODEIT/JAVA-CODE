import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void power(int n,int m){
        System.out.println(Math.pow(n,m));
    }
    public static void main(String []args){
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        n=sc.nextInt();
        System.out.println("Enter the power: ");
        m=sc.nextInt();
        power(n,m);
    }
}
