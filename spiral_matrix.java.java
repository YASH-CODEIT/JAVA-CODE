import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       int n,m,rowStart,rowEnd,colStart,colEnd,i,j;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of rows of nxm matrix: ");
       n=sc.nextInt();
        System.out.println("Enter the no of columns of nxm matrix: ");
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter the no of array: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.print("\n");
        }
        rowStart=0;
        rowEnd=n-1;
        colStart=0;
        colEnd=m-1;
        System.out.println("The spiral matrix is : ");
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(i=colStart;i<=colEnd;i++){
                System.out.print(arr[rowStart][i]+" ");
            }

            rowStart++;
            for(i=rowStart;i<=rowEnd;i++) {
                System.out.print(arr[i][colEnd] + " ");
            }
            colEnd--;
            for(i=colEnd;i>=colStart;i--){
                System.out.print(arr[rowEnd][i]+" ");
            }

            System.out.print("\n");
            rowEnd--;
            for(i=rowEnd;i>=rowStart;i--){
                System.out.print(arr[i][colStart]+" ");
            }
            colStart++;
        }
    }
}