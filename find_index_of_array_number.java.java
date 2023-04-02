import java.util.Scanner;
class New{
    public static void main(String []args){
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to finds its position :");
        int number=sc.nextInt();
        for(int j=0;j<arr.length;j++){
            if(arr[j]==number){
                System.out.println("The position of the element is : ");
                System.out.println(j+1);
                break;
            }
        }
    }
}