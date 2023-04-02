import java.util.Scanner;
public class Main {
    public static void fibonaciSeries(int n){
        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        return;
    }
    public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the term: ");
        n=sc.nextInt();
        System.out.println("The fibonaci Series upto "+n+" term");
    fibonaciSeries(n);
    }
}