import java.util.*;
class Main{
  public static int calGuests(int n){
      if(n<=1){
          return 1;
      }
      //1 way
      int way1=calGuests(n-1);
      //2 way
      int way2=(n-1)*calGuests(n-2);

      return way1+way2;
  }
    public static void main(String []args){
      int n=4;
      System.out.println(calGuests(n));
    }
}