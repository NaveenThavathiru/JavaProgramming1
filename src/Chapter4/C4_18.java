
package Chapter4;
import java.util.Scanner;
/**
 * Program Displays a course matched with a grade level based on user input.
 *
 * @author Naveen Thavathiru
 */
public class C4_18 {
 /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */


    public static void main(String[] args)
   
    {   
             Scanner in = new Scanner(System.in);
        //Asks user to enter the two characters
        System.out.print("Enter a letter and a number: ");
        String status = in.next();
        
        char major = Character.toUpperCase(status.charAt(0));
        char grade = status.charAt(1);
        //Tells code which character is for which variable.
        
        String courseName = "";
        String gradeName = "";
        //empty string
        if (major == 'M' || major == 'I' || major == 'C')
            // this finds the name based on the character entered.
        {
            switch(major)
            {
                case 'M':
                    courseName = "Mathematics";
                    break;
                case 'C':
                    courseName = "Computer Science";
                    break;
                case 'I':
                    courseName = "Information Technology";
                    break;
                default:
                    break;
            }
            // this finds the name based on the character entered.
            switch(grade)
            {
                case '1':
                    gradeName = "Freshman";
                    break;
                case '2':
                    gradeName = "Sophmore";
                    break;
                case '3':
                    gradeName = "Junior";
                    break;
                case '4':
                    gradeName = "Senior";
                    break;
                default:
                    break;
            }
            // Prints out the course name and the course grade
            System.out.printf(courseName + " " +gradeName);
        }
        // If they do not match the variables then it would say "Invalid input" then display the input.
        else{
            System.out.printf("Invalid input.%n");
        }
    }
}

