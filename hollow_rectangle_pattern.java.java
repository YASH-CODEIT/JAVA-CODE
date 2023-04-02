import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       int n,i,j,m;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows you want to print: ");
        n=sc.nextInt();
        m=n+1;
        for( i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
        }
            System.out.println();
        }
    }
}