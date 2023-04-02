import java.util.Scanner;
class VotingCretria extends RuntimeException{
    VotingCretria(String msg){
        System.out.println(msg);
    }
}
public class Voting {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        try {
            if (age < 18) {
                throw new VotingCretria("You are not eligble to vote");
            } else {
                System.out.println("You can vote");
            }
        }
        catch(VotingCretria e){
            e.printStackTrace();
        }

    }
}
