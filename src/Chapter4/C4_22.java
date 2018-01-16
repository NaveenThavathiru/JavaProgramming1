
package Chapter4;

import java.util.Scanner;
/**
 * Program shows whether what is entered by a string is either a sub string of the other string or not a substring of the other string.
 *
 * @author Naveen Thavathiru
 */
public class C4_22 
{
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

     public static void main(String[] args) 
     {
        
        Scanner in = new Scanner(System.in);
        //asks the user to enter the first string
        System.out.print("Enter string s1: ");
        String string1 = in.nextLine();
        //asks the user to enter the second string
        System.out.print("Enter string s2: ");
        String string2 = in.nextLine();
        //figures out if the string is a substring or not
        if (string1.contains(string2)) {
            System.out.printf(string1 + " is a substring of " + string2);
        } 
        else{
            System.out.printf(string1 + "is not a substring of" + string2);
        }
    }
}

