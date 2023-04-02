import java.util.Scanner;
public class TicTacToe {


    void printTicTacToeBoard(char[][] board) {
        System.out.println("Board: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    char checkPlayerWinOrNot(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (((board[i][0] == board[i][1]) && (board[i][1] == board[i][2])) && (!((board[i][0] == '-') && (board[i][1] == '-') && (board[i][2] == '-')))) {
                return board[i][0];
            }
            if (((board[0][i] == board[1][i]) && (board[1][i] == board[2][i])) && (!((board[0][i] == '-') && (board[1][i] == '-') && (board[2][i] == '-')))) {
                return board[0][i];
            }
            if(((board[0][0]==board[1][1]) && (board[1][1]==board[2][2])) &&(!((board[0][0]=='-') && (board[1][1]=='-') && (board[2][2]=='-')))){
                return board[0][0];
            }
             if(((board[2][0]==board[1][1]) && (board[1][1]==board[0][2])) && (!((board[2][0]=='-') && (board[1][1]=='-') && (board[0][2]=='-')))){
                 return board[i][0];
             }
        }
        return ' ';
    }
    Boolean isFullBoard(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]=='-'){
                    return false;
                }
            }
        }
        return true;
    }
        public static void main(String []args){
        TicTacToe obj=new TicTacToe();
        char [][]board=new char[3][3];
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        System.out.println("Welcome to Tic Tac Toe game!!");
        Scanner sc=new Scanner(System.in);
        System.out.print("Player1 , Enter your name: ");
        String p1=sc.nextLine();
        System.out.print("Player2 , Enter your name: ");
        String p2=sc.nextLine();
        obj.printTicTacToeBoard(board);
        Boolean player1=true;
        Boolean player2=false;
        int row;
        int col;
        char c;
        while(true){
            Boolean gameEnded=false;
            if(player1){
                System.out.println(p1+" turns(x):");
                player1=false;
                player2=true;
                c='x';
            }
            else{
                System.out.println(p2+" turns(o):");
                player1=true;
                player2=false;
                c='o';
            }
            System.out.print("Enter a row number(0,1 or 2) :");
            row=sc.nextInt();
            System.out.print("Enter a column number(0,1 or 2) :");
            col=sc.nextInt();
         while(true){
              if(((row>2 || row<0) && (col>3 || col<0)) || (board[row][col]=='x' || board[row][col]=='o')){
                  System.out.println("Invalid Move!!!");
                  System.out.println("Enter Valid Move!!!");
                  System.out.print("Enter a row number(0,1 or 2) :");
                  row=sc.nextInt();
                  System.out.print("Enter a column number(0,1 or 2) :");
                  col=sc.nextInt();
              }
              else{
                  break;
              }
          }
            board[row][col]=c;
          obj.printTicTacToeBoard(board);
          if(obj.checkPlayerWinOrNot(board)=='x'){
              System.out.println(p1 + " has Won.Congratulation!!!");
              break;
          }if(obj.checkPlayerWinOrNot(board)=='o'){
              System.out.println(p2+ " has Won.Congratulation!!!");
              break;
          }
            if(obj.isFullBoard(board)){
                System.out.println("It is tie. No one win!!!");
                break;
            }
        }
    }
}
