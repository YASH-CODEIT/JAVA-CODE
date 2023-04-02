import java.util.Scanner;
class Main{
    public static int printPower(int n,int m){
        if(m==0){
            return 1;
        }
        if(n==1){
            return 0;
        }
        int n_m=printPower(n,m-1);
        int result=n*n_m;
        return result;
    }
    public static void main(String[] args){
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        n=sc.nextInt();
        System.out.println("Enter the power ");
        m=sc.nextInt();
        int m1=printPower(n,m);
        System.out.println(m1);
    }
}