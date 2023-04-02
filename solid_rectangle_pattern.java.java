import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of row you wan to print: ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<n+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}