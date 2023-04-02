package com.java;
import java.util.Scanner;
class RandomNo{
    int rand,n,k=0;
      RandomNo(){
        rand=(int)(Math.random()*100);
          System.out.println(rand);
    }
    public void userInput(){
        System.out.println("Enter a number between 0 to 100.");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
    }
    public boolean isInputCorrect(){
          if(n<rand){
              System.out.println("The guess no is smaller than the actual no.");
              return false;
          }
          else if(n>rand){
              System.out.println("The guess no is greater than the actual no.");
              return false;
          }
    else {
              userWin();
          }
    return true;
    }
    public void userWin(){
        System.out.println("User Win");
        System.out.println("Total no of Guess: "+k);
    }
    public void userLose(){
        System.out.println("You are not able to guess the number.");
        System.out.println("The Actual No is : "+rand);
    }
    public int setGuess(){
        k++;
        return k;
    }

}
class GuessNo{
    public static void main(String []args){
        System.out.println("Welcome to Number guessing game!!!");
        System.out.println("You have five try to guess the Correct number.");
        RandomNo obj=new RandomNo();
        while(obj.setGuess()<=5) {
            obj.userInput();
            if (obj.isInputCorrect()) {
                break;
            }
        }
        if(obj.k==6){
           obj.userLose();
        }
        System.out.println("Thanks you for playing Game.");
    }
}