import java.util.Scanner;

public class Main{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to write its table in reverse order: ");
        int n=sc.nextInt();
        for(int i=10;i>0;i--){
            System.out.println(n+ "x" +i+ "=" +(n*i));
        }
        }
    }