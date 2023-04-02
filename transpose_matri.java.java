import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       int n,m,i,j;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows of matrix: ");
        n=sc.nextInt();
        System.out.println("Enter the columns of a matrix: ");
        m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter the no of matrix: ");
        for(i=0;i<n;i++){
           for(j=0;j<m;j++){
               arr[i][j]=sc.nextInt();
           }
        }
        System.out.println("The transpose of a matrix is : ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.print("\n");
        }
    }
}

