import java.util.Scanner;
class Main{
    public static void printFifoSeries(int a,int b,int n,int count){
        if(count==n+1){
            return;
        }
      int c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
        printFifoSeries(a,b,n,count+1);
    }
    public static void main(String[] args){
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of terms to prints Fibonacci Series: ");
        n=sc.nextInt();
        System.out.println("The Fibonacci Series is: ");
        System.out.print("0 1 ");
        printFifoSeries(0,1,n-2,count);
    }
}