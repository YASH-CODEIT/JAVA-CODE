import java.util.Scanner;
public class Main {
    public static int sumOddNo(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(!(i%2==0))
                sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
     int n;
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter The value of n to find sum of all odd no from 1 to n:");
        n=sc.nextInt();
        System.out.println(sumOddNo(n));
    }
}