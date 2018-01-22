
package Chapter7;
import java.util.Scanner;

/**
 * Displays the minimum value of 10 numbers entered by the user.
 * 
 *
 * @author Naveen Thavathiru
 */

public class C7_9 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
               // Creates the array with a length of 10
		double[] numbers = new double[10]; 

		// tells the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		// Displays the minimum value
		System.out.println("The minimum number is: " + minimum(numbers));
	}

	//gets the smallest value
        /**
         * 
         * @param array Holds values in an array
         * @return returns minimum value
         */
	public static double minimum(double[] array) {
		double min = array[0];	
		for (double i: array) {
			if (i < min)
				min = i;
		}
		return min;
	}
}
