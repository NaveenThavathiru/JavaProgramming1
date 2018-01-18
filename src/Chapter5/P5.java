package Chapter5;
//Naveen Thavathiru

import java.util.Scanner;

/**
 * Program counts the amount of yes votes, no votes, and total votes based on
 * user input.
 *
 * @author Naveen Thavathiru
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("To vote Yes enter Y! to vote No enter N! to exit voting enter Q!");

        String sVote = input.next().toUpperCase();

        int Yes = 0;
        int No = 0;
        int Q = 0;

        while (!sVote.equals("Q")) {
            if (sVote.equals("Y")) {
                Yes++;
            } else if (sVote.equals("N")) {
                No++;
            } else {
                System.out.println("INVALID CODE: Enter 'Y' to vote yes, and 'N' to vote no, or 'Q' to quit voting");
                Q++;
            }
            System.out.println("Enter your vote: ");
            sVote = input.next().toUpperCase();
        }
        int TotalVotes = Q + No + Yes;
        System.out.println("Amount of Yes votes: " + Yes + " Amount of No votes: " + No);
        System.out.println("Total votes: " + TotalVotes);
    }
}
