import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        boolean game = true;
//Creating the dice for the game to have dice rolls
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2;
        String decision;
//Creating the outputs for the dice roll results
        while (game == true) {
            System.out.print("Your roll is " + crapsRoll + ". ");
            if (crapsRoll == 12 || crapsRoll == 3 || crapsRoll == 2) {
                System.out.println("Craps! You lose!");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("Natural! You Win!");
            } else {
                if (crapsRoll == 4 || crapsRoll == 5 || crapsRoll == 6 || crapsRoll == 8 || crapsRoll == 9)
                    System.out.println("Your point is " + crapsRoll);
                else if (crapsRoll == 7) {
                    System.out.println("Craps! You Lost!");
                }
            }
            System.out.println("Do you want to play again? y or n?");
            decision = scan.nextLine();
            if (decision.charAt(0) == 'y') {
                    game = true;
            }
            else {
                System.out.println("Hope you had fun! Goodbye!");
                game = false;
            }


        }

    }
}