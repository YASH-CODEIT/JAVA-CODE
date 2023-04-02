import java.util.Scanner;
class New {
    public static void main(String[] args) {
        int rows, columns,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of Array: ");
        rows = sc.nextInt();
        System.out.println("Enter the columns of Array: ");
        columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter the numbers of Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int  m = 0; m < rows; m++) {
            for (int  n = 0; n < columns; n++) {
                System.out.print(arr[m][n]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Enter the number to find it's position: ");
        num=sc.nextInt();

        for(int p=0;p<rows;p++){
            for(int q=0;q<columns;q++){
                if(num==arr[p][q])
                    System.out.println("row: "+(p+1)+ " columns: "+(q+1));
            }
        }
    }
}

