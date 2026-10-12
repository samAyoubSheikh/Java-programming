import java.util.Scanner;
import java.security.SecureRandom;
public class RockPaperScissors {
    public static void main(String []args){
        SecureRandom secureRandom = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your move: ");
        int humanTyped = sc.nextInt();
        switch (humanTyped){
            case 1 ->System.out.println("You have chosen rock.");
            case 2 -> System.out.println("You have chosen Paper.");
            case 3 -> System.out.println("You have chosen Scissor.");
            default -> System.out.println("Invalid move. Please make a valid move.");
        }
        System.out.println("Computer has chosen: ");
        //this line will generate a random number either 1 2 or 3
        int computerGenerated = secureRandom.nextInt(1,3);

        System.out.println(computerGenerated);
        //switching that number ,hence follow the condition
        switch (computerGenerated) {
            case 1 -> System.out.println("Computer have chosen rock.");
            case 2 -> System.out.println("Computer have chosen Paper.");
            case 3 -> System.out.println("Computer have chosen Scissor.");
        }
        if (humanTyped == computerGenerated){
            System.out.println("Match tie.");
        }
        else if((humanTyped == 1 && computerGenerated == 2)||(humanTyped == 2 && computerGenerated == 3)||(humanTyped == 3 && computerGenerated == 1)){
            System.out.println("Computer won!");
        }
        else if((humanTyped == 1 && computerGenerated == 3)||(humanTyped == 2 && computerGenerated == 1)||(humanTyped == 3 && computerGenerated == 2)) {
            System.out.println("Congratulations! You won the game!");
        }
        else if(humanTyped >= 4){
            System.out.println("Match cannot be played");
        }
    }
}