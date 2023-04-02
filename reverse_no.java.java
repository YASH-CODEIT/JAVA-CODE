import java.util.Scanner;
class Main{
    public static void main(String []args){
        long r=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n=sc.nextInt();
        while(n>0) {
            r = n % 10;
            n = n / 10;
            System.out.print(r);
        }

    }
}

