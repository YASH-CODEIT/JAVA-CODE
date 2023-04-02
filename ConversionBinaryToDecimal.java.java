import java.util.Scanner;
class Main{
    public static void DecimalNo(int BinaryNo){
        int myNum=BinaryNo;
        int pow=0;
        int decimal=0;
        int LastNo;
        while(BinaryNo>0) {
            LastNo = BinaryNo % 10;
            decimal += (LastNo * (int) Math.pow(2, pow));
            pow++;
            BinaryNo = BinaryNo / 10;
        }
        System.out.println("The Decimal of Binary No "+myNum+" is: "+decimal);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary  No to gets its Decimal No: ");
        int n=sc.nextInt();
        DecimalNo(n);
    }
}