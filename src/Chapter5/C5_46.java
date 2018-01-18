package Chapter5;

import java.util.*;

/**
 * Reverses string entered by user input.
 *
 * @author Naveen Thavathiru
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        //gets the string to reverse
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse it:");
        original = in.nextLine();

        int length = original.length();
        //reverses the characters to get a reversed string
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        //displays the reversed string.
        System.out.println("Reverse of entered string is: " + reverse);
    }
}
