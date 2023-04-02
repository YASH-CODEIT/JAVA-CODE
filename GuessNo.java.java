package com.java;
import java.util.Scanner;
 class GuessNo{
     public static void main(String []args){
         System.out.println("Welcome to Number guessing game!!!");
         System.out.println("You have three try to guess the Correct Number.");
         int rand=(int)(Math.random()*1000);
         int k=1;
         while(k<=3){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the digit in the range of 3 only not above that.");
             int n=sc.nextInt();
             if(n>rand){
                 System.out.println("The guessed number is higher than the actual number.");
             }
             else if(n<rand){
                 System.out.println("The guessed number is smaller than the actual number.");
             }
             else{
                 System.out.println("You won!!!");
                 break;
             }
             k++;
         }
         if(k==4){
             System.out.println("You are not able to guess the number");
             System.out.println("The Actual No is : "+rand);
         }
     }
 }