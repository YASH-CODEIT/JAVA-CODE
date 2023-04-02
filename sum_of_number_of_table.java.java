import java.util.Scanner;

public class New{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print its table: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d",n,i,(n*i));
            System.out.println(" ");
        }
        System.out.println("The sum of the number of table is : ");
     for(int i=0;i<=10;i++){
         sum+=n*i;
     }
        System.out.println(sum);
        }
    }
