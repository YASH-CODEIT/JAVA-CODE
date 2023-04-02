import java.util.Scanner;
public class Main {
public static void maxMinNo(int n1,int n2,int n3){
    System.out.print("Max: ");
    if(n1>n2 && n1>n3)
        System.out.print(n1);
    else if(n2>n1 && n2>n3)
        System.out.print(n2);
    else
        System.out.print(n3);
    System.out.println();
    System.out.print("Min: ");
    if(n1<n2 && n1<n3)
        System.out.print(n1);
    else if(n2<n1 && n2<n3)
        System.out.print(n2);
    else
        System.out.print(n3);
    return;
}
    public static void main(String[] args) {
    int n1,n2,n3;
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter three no to finds Max and Min.");
     n1=sc.nextInt();
     n2=sc.nextInt();
     n3=sc.nextInt();
     maxMinNo(n1,n2,n3);
}
}