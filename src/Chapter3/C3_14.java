
package Chapter3;

import java.util.Scanner;
/**
 * The program asks the user to guess either heads or tails and displays of you guessed right or wrong. 
 *
 * @author Naveen Thavathiru
 */

public class C3_14
{
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Heads or Tails?");
		System.out.println("Heads is 0 and Tails is 1: ");
		int guess = input.nextInt();

	    int Compguess = (int) (Math.random() * 2);
            System.out.println(Compguess);
		if(guess == Compguess) 
		
		    System.out.println("You won!");
		else
		    System.out.println("You lost.");
	    	
	}
}
