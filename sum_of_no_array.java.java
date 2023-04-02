import java.util.Scanner;

class New {
    public static void main(String[] args) {
      int i;
      float sum=0;
      Scanner sc=new Scanner(System.in);
      float []arr=new float[5];
      for(i=0;i<arr.length;i++){
          arr[i]=sc.nextFloat();
          sum+=arr[i];
      }
        System.out.println(sum);
    }
}

