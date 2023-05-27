import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int userScore=0,opponentScore=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper,Scissor Game.");
        while(true){
            System.out.println("Make a move by entering rock, paper, scissor or If you want to quit enter exit");
            String myMove=sc.nextLine();
            if(myMove.equals("exit")){
                break;
            }
            if(!(myMove.equals("rock")) && !(myMove.equals("paper")) &&  !(myMove.equals("scissor"))){
                System.out.println("Invalid move!!");
            }
            else{
                int randomNo=(int)(Math.random()*3);
                String opponentMove="";
                if(randomNo==0)
                    opponentMove="rock";
                else if(randomNo==1)
                    opponentMove="paper";
                else
                    opponentMove="scissor";
                System.out.println("Opponent Move: "+ opponentMove + "\n");
                if(myMove.equals(opponentMove)) {
                    System.out.println("It is tie.");
                }
                else if((myMove.equals("paper") && opponentMove.equals("rock")) || (myMove.equals("rock") && opponentMove.equals("scissor")) ||
                        (myMove.equals("scissor") && opponentMove.equals("paper"))) {
                    System.out.println("You Win!");
                    userScore++;
                }
                else {
                    System.out.println("You Lose!");
                    opponentScore++;
                }
            }
        }
        System.out.println("The Score Board is :");
        System.out.println("Opponent      You");
                System.out.println(userScore+ "              "+ opponentScore);
                if(userScore>opponentScore)
                    System.out.println("The final winner is You!");
                else
                    System.out.println("The final winner is your Opponent. ");
        System.out.println("Thank you for playing Stone, Paper Scissor Game.");
    }
}
