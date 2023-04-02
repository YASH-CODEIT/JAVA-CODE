import java.util.Scanner;
class Main{
    public static void Swap(int a,int b){
        int temp;
        temp=b;
        b=a;
        a=temp;
        System.out.println("After Swapping:"+
                "\nThe value of a is: "+a+
                "\nThe value of b is: "+b);

    }
    public static void main(String []args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a=sc.nextInt();
        System.out.println("Enter the value of b is: ");
        b=sc.nextInt();
        Swap(a,b);

    }
}