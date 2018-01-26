package Chapter7;

import java.util.Scanner;

/**
 * Program Tell user the students score and letter grade based on score entered
 * by user input.
 *
 * @author Naveen Thavathiru
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from the command line
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // tells the user to enter the total number of students
        System.out.print("Enter the nubmer of students: ");
        int[] scores = new int[input.nextInt()];
        char[] grades = new char[scores.length];

        // tells the user to enter all the scores
        System.out.print("Enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        getGrades(scores, grades);

        // shows the results
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + "'s score is " + scores[i] + ". Their grade is " + grades[i]);
        }
    }

    //returns the highest score //
    /**
     *
     * @param array Values held in an array
     *
     * @return
     */
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //assigns the grades//
    /**
     *
     * @param scores The number score entered in by the user
     * @param grades letter grades determined off of the score entered by the
     * user.
     */
    public static void getGrades(int[] scores, char[] grades) {
        int best = max(scores);
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= best - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= best - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= best - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
    }
}
