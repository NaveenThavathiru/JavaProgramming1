package Chapter2;

import java.util.Scanner;

/**
 * Program to Ask user input to convert Celsius to Fahrenheit
 *
 * @author Naveen Thavathiru
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Celsius:");
        double celsius = input.nextDouble();
//                ^Value of Input
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

    }

}
