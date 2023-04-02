public class Main{
    public static void main(String []args)
    {
       for(int i=1;i<=5;i++){
           for(int j=1;j<i;j++){
               System.out.printf(" ");
           }
           for(int k=i;k<=5;k++){
               System.out.printf("*");
           }
           System.out.printf("\n");
       }
    }
}
