
package Chapter2;
import java.util.Scanner;
/**
 * Program to display Gratuity and total based on users input of subtotal and gratuity rate
 *
 * @author Naveen Thavathiru
 */

public class C2_5 
{
      /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

        public static void main(String[] args)
                
{
    Scanner input = new Scanner (System.in);
    
    System.out.println("Enter the subtotal:");
    double subtotal = input.nextDouble();
    
    System.out.println("Enter the gratuity rate:");
    double gratuityrate = input.nextDouble();
    
    double gratuity = subtotal * (gratuityrate / 100);
		double total = subtotal + gratuity;
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
}
}

