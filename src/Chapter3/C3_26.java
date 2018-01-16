
package Chapter3;


import java.util.Scanner;
/**
 * Decides if a number entered by a user is divisible by 5 and/or 6.
 *
 * @author Naveen Thavathiru
 */
public class C3_26
{    
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
		
		//Asks the user to input a number to use in the equation
		System.out.println("Enter a number: ");
		int divideNumber = input.nextInt();
		
		//this part of the code asks if the number is divisible by 5 and 6
		if (((divideNumber % 5) == 0.0) && (((divideNumber % 6) == 0)))
		
		    System.out.println("Is " + divideNumber+ " divisible by 5 and 6? True!");
			else
			    System.out.println("Is " + divideNumber + " divisible by 5 and 6? False");
				
				
        //Asks if the number can be divided by 5 or 6
	    if (((divideNumber % 5) == 0.0) || (((divideNumber % 6) == 0)))
		
		    System.out.println("Is " + divideNumber + " divisible by 5 or 6? True!");
			else
			    System.out.println("Is " + divideNumber + " divisible by 5 or 6? False");
				
				
		//does the same as previous lines but makes sure that it can not be divided by both
		if ((((divideNumber % 5) == 0.0) || (((divideNumber % 6) == 0))) ^ (((divideNumber % 5) == 0.0) && (((divideNumber % 6) == 0))) )
		
		    System.out.println("Is " + divideNumber + " divisible by 5 or 6, but not both? True!");
			else
			    System.out.println("Is " + divideNumber + " divisible by 5 or 6, but not both? False!");
				
	}
}
