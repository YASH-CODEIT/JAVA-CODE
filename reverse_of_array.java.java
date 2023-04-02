import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      int n,i,size;
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the no  of an array: ");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The reverse of an array is : ");
        for(i=size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    }