public class Main{
    public static void main(String []args)
    {
       for(int i=1;i<=5;i++){
           for(int j=i;j<=4;j++){
               System.out.printf(" ");
           }
           for(int k=1;k<=i;k++) {
               System.out.printf("%d",i);
           }
           for(int m=1;m<i;m++){
               System.out.printf("%d",i);
           }
           for(int L=1;L<=5;L++){
               System.out.printf(" ");
           }
           System.out.printf("\n");

       }
    }
}
