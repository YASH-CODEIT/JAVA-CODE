import java.util.Scanner;

class Main{
    public static void main(String []args){
        int n,pos,bitmask,newNumber;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        System.out.println("Enter the position to set the bit: ");
        pos=sc.nextInt();
        bitmask=1<<pos;
       newNumber=(~bitmask) & n;
       if(newNumber==n)
       System.out.println("No change: "+n);
       else
        System.out.println("New Number is: "+newNumber);
    }

}


