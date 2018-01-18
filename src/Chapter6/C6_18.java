package Chapter6;

import java.util.Scanner;

/**
 * Program checks whether or not a password is valid or not
 *
 *
 * @author Naveen Thavathiru
 */
public class C6_18 {

    public static final int Length = 8; // password required length

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
//Asks user to enter a password
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A Password!: ");
        String s = input.nextLine();
//if else to let the user know if their password is valid or not
        if (isValidPassword(s)) {
            System.out.println("This is a valid password!: " + s);
        } else {
            System.out.println("This is not a valid password.: " + s);
        }

    }

    /**
     * isValidPassword
     *
     * @param password is the password entered by the user.
     * @return whether the password is false or not.
     */
    public static boolean isValidPassword(String password) {
//Checks character count
        if (password.length() < Length) {
            return false;
        }

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (isNumeric(ch)) {
                numCount++;
            } else if (isLetter(ch)) {
                charCount++;
            } else {
                return false;
            }
        }

        return (charCount >= 2 && numCount >= 2);
    }
//checks if it is a letter

    /**
     * isLetter
     *
     * @param ch Is the character entered by user
     * @return true of false based on if it is a letter or not
     */
    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

//checks if there is a number
    /**
     * isNumeric
     *
     * @param ch Entered number
     * @return True or false based on if it is a number under 9 and number over
     * 0.
     */
    public static boolean isNumeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}
