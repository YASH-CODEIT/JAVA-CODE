import java.util.Scanner;

class New {
    public static void main(String[] args) {
        int n=2,m=3,i,j;
        int arr1[][]=new int[n][m];
        int arr2[][]=new int[n][m];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of arr1: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr1[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Enter the no of arr2: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr2[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
        System.out.println("The sum of arr1 and arr2 is: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}