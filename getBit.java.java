import java.util.Scanner;

class Main{
    public static void main(String []args){
        int n,pos,bitmask;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        System.out.println("Enter the position to get the bit: ");
        pos=sc.nextInt();
        bitmask=1<<pos;
        if((bitmask & n)==0)
            System.out.println("The bit at " +pos+ " is : 0");
        else
            System.out.println("The bit at " +pos+ " is : 1");
    }

}
