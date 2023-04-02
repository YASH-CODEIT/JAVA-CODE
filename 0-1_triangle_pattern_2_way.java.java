public class Main{
    public static void main(String []args) {
        int sum=0;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
               if((i+j)%2==0)
               System.out.printf("1"+" ");
               else
               System.out.printf("0"+" ");

            }
            System.out.println();
    }
}


        }