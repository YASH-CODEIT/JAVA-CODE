import java.util.Scanner;
public class Main {
    public static int multiTwoNo(int n1,int n2){
        System.out.println("The multi of n1 and n2 is :"+(n1*n2));
        return 1;
    }
    public static void main(String[] args) {
       int n1,n2;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no: ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        multiTwoNo(n1,n2);
    }
}