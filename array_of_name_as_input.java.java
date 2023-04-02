import java.util.Scanner;
class New{
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       String arr[]=new String[5];
        System.out.println("Enters the names: ");
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.next();
        }
        System.out.println("The names are: ");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
