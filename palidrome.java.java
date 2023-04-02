import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String oldString,newString="";
      System.out.println("Enter String to check whether it is palindrome or not.");
      oldString=sc.nextLine();
      for(int i=oldString.length()-1;i>=0;i--){
          newString=newString+oldString.charAt(i);
      }
      if(newString.equals(oldString)){
          System.out.println("Yes");
      }
      else{
          System.out.println("No");
      }
    }
}