
package Chapter3;
import java.util.Scanner;
/**
 * Program shows what grade letter the entered number of the user is.
 *
 * @author Naveen Thavathiru
 */
public class P3{
    
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args)
            
    {
         {
           Scanner input = new Scanner(System.in);
System.out.print("Enter your first number:");
double NumberOne = input.nextDouble();
System.out.print("Enter your second number:");
double NumberTwo = input.nextDouble();

if (NumberOne < NumberTwo){
    System.out.println("The first number is less than the second.");
}
else if (NumberOne > NumberTwo){
    System.out.println("The first number is greater than the second.");
}
else 
		 System.out.println("The first number is equal to the second");
		
		//this part compares if the number are less than or more than and eqaul to each other. 
		if (NumberOne <= NumberTwo)
			System.out.println("The first number is less than or equal to the second"); 
			else
				System.out.println("The first number is not equal to the second"); 
			
		//checks to see if the number is zero
		if (NumberTwo == 0.0)
			System.out.println("Cannot divide by zero"); 
		else 
			if ((NumberOne / NumberTwo) < 1.0)
				System.out.println("This is a proper fraction"); 
		else 
			System.out.println("This is an improper fraction"); 
		//cecks the division of the numbers is correct
		
		//checks to see what number1's grade is
		if (NumberOne >= 90.0)
			System.out.println("Grade: A");
		else 
			if (NumberOne >= 80.0)
				System.out.println("Grade:B "); 
			else 
				if (NumberOne >= 70.0)
					System.out.println("Grade: C"); 
				else
					if (NumberOne >= 60.0)
						System.out.println("Grade: D"); 
					else 
						System.out.println("Grade: F"); 
					
		//this part compares the range of the number
		if ((NumberTwo >= 1) && (NumberTwo <= 100))
			System.out.println("This is in Range");
		else 
			System.out.println("This is out of Range"); 
	}
}
}
