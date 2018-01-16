
package Chapter2;

import java.util.Scanner;
/**
 * Program to display Area and volume based on the users input of radius and length
 *
 * @author Naveen Thavathiru
 */

public class C2_2 
{
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
          public static void main(String[] args)
                  
          {
              Scanner input = new Scanner(System.in);
              
              System.out.println("Enter The Radius: ");
              double radius = input.nextDouble();
              
              System.out.println("Enter the length: ");
              double length = input.nextDouble();
              
              double area = radius * radius * Math.PI;
              
              double volume = area * length;
              System.out.println(" The are is: " + area);
              System.out.println(" the volume is: " + volume);
          }
}
