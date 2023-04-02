import java.util.*;
class Main{
    public static void main(String []args){
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to finds its factors: ");
        n=sc.nextInt();
        System.out.println("The factors of "+n+" is ");
        for(i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }

    }
}
