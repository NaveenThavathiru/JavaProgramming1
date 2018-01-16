
package Chapter2;

import java.util.Scanner;
/**
 *
 * Program displays the total, tax, food, and tip of a meal, drink, and dessert.
 * @author Naveen Thavathiru
 */

public class P2{
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
            
    {
         {
           Scanner input = new Scanner(System.in);
System.out.print("Enter the price of the meal:");

double meal = input.nextDouble();

System.out.print("Enter the price of the drink:");
double drink = input.nextDouble();

System.out.print("Enter the price of the dessert:");
double dessert = input.nextDouble();

double total = (meal + drink + dessert);
        
double tax = (total * 0.10);

double tip = ((total + tax) * 0.15);

double totalcost = (total + tax + tip);

System.out.println("food:"+ total);
System.out.println("tax:" + tax);
System.out.println("tip:" + tip);
System.out.println("total cost:" + totalcost);

        }
}
}
          