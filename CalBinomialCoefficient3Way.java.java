import java.util.Scanner;
class Main{
  public static int BinomialCoefficient(int n,int r,int n_r){
      int fact_n=1,fact_r=1,factn_r=1;
      for(int i=2;i<=n;i++){
          fact_n*=i;
      }
      for(int i=2;i<=r;i++){
          fact_r*=i;
      }
      for(int i=2;i<=n_r;i++){
          factn_r*=i;
      }
      return fact_n/(fact_r*factn_r);
  }
    public static void main(String []args){
        int n,r,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        System.out.println("Enter the value of r: ");
        r=sc.nextInt();
        result=BinomialCoefficient(n,r,n-r);
        System.out.println("The Binomial Coefficient is : "+result);

    }
}