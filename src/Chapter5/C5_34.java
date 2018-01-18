package Chapter5;

import java.util.Scanner;

/**
 * Computer plays rock paper scissors against user. Program decides who is
 * winner based on user input and computer selection
 *
 * @author Naveen Thavathiru
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
//sets initial values to the Wins
        int compWins = 0;
        int userWins = 0;
// the math that determines if one is 2 times the score of the other.
        while (userWins != compWins * 2 && compWins != userWins * 2 || userWins == 0 && compWins == 0) {
            // the computerHand is what number the computer chooses
            int computerHand = (int) (Math.random() * 3);

            Scanner input = new Scanner(System.in);
            // tells human/person/user/player to select either rock paper or scissor
            System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
            int playerHand = input.nextInt();
            // this is where the code figures out if you won or not
            String computer = getHand(computerHand);
            String player = getHand(playerHand);
            String gameStats = getGameStatus(computerHand, playerHand);
            // this is where the code adds a win to either you or the computer based on if you lost or won,
            if (gameStats.equals("You won")) {
                userWins++;
            }

            if (gameStats.equals("You lost")) {
                compWins++;
            }
            //lets you know the selections and who won.
            System.out.println("The computer is " + computer + ". You are " + player + ". " + gameStats + ".");

        }
        // once one person has 2 times more wins than the other.
        if (userWins > compWins) {
            System.out.println("You won the game! " + "Player wins: " + userWins + " Computer wins: " + compWins);
        } else {
            System.out.println("You lost the game. " + "Player wins: " + userWins + " Computer wins: " + compWins);

        }

    }

    /**
     * getHand
     *
     * @param hand is the users selection of either scissor, rock, paper, or
     * null.
     * @return either scissor, rock, paper, or null based on users numeric
     * input.
     */
    public static String getHand(int hand) {

        String handString;
        switch (hand) {
            case 0:
                handString = "scissor";
                break;
            case 1:
                handString = "rock";
                break;
            case 2:
                handString = "paper";
                break;
            default:
                handString = null;
        }
        return handString;
    }
//sets value for getGameStatus to be displayed in the code above

    /**
     * getGameStatus
     *
     * @param computer is the computer's selection of either rock, paper, or
     * scissor.
     * @param player is the player's selection of either rock, paper, or
     * scissor.
     * @return status of who won.
     */
    public static String getGameStatus(int computer, int player) {
        if (computer == player) {
            return "It's a draw";
        }

        String status = "";
        switch (player) {
            case 0:
                status = (computer != 1) ? "You won" : "You lost";
                break;
            case 1:
                status = (computer != 2) ? "You won" : "You lost";
                break;
            case 2:
                status = (computer != 0) ? "You won" : "You lost";
                break;
        }

        return status;
    }

}
