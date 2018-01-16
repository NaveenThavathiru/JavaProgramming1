
package Chapter3;

import java.util.Scanner;
/**
 * Program decides which package has a better value, or if both packages have the same value based on the weight and price entered by the user.
 *
 * @author Naveen Thavathiru
 */
public class C3_33
{     
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
		
            // weight
		System.out.println("Enter weight for package 1: ");
		double weight1 = input.nextDouble();
            // price
                System.out.println("Enter price for package 1: ");
		double price1 = input.nextDouble();
            // weight
                System.out.println("Enter weight for package 2: ");
		double weight2 = input.nextDouble();
            // price
                System.out.println("Enter price for package 2: ");
		double price2 = input.nextDouble();
            //decides cost per pound
                double costperpound1 = price1 / weight1;
                double costperpound2 = price2 / weight2;
            //decides which package has better value
                if(costperpound1 > costperpound2)
                    System.out.println("Package 2 has better value.");
                else
                    if(costperpound2 > costperpound1)
                    System.out.println("Package 1 has better value.");
                else
                    System.out.println("Both packages have equal values.");
                
        }
}




