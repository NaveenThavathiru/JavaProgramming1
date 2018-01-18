package Chapter6;

import java.util.Scanner;
import java.text.*;

/**
 * Program finds how many Euros, Pounds, or Yen you will be able to buy with
 * dollars based on user input.
 *
 *
 * @author Naveen Thavathiru
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Asks user for values of money
        Scanner input = new Scanner(System.in);
        System.out.print("How many Euros does a dollar buy? : ");
        double Euro = input.nextDouble();

        System.out.print("How many Pound Sterling does a dollar buy? : ");
        double Pound = input.nextDouble();

        System.out.print("How many Yen does a dollar buy? : ");
        double Yen = input.nextDouble();

        System.out.print("Please enter the number of dollars you want to convert: $");
        double DollarsNum = input.nextDouble();

        System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
        String typeOfMoney = input.next();
        calculations(typeOfMoney, DollarsNum, Yen, Pound, Euro, input);
    }

    /**
     * calculations
     *
     * @param typeOfMoney the form of currency being used in the calculation
     * @param numOfDollars the number of dollars in the calculation
     * @param yen the value of yen
     * @param pound the value of pound
     * @param euro the value euro
     * @param input user response input to continue the program or not.
     */
    public static void calculations(String typeOfMoney, double numOfDollars, double yen, double pound, double euro, Scanner input) {
        DecimalFormat d2 = new DecimalFormat("0.00");
        double euros1 = 0, pound1 = 0, yen1 = 0, euros2 = 0,
                pound2 = 0, yen2 = 0;
//depending on the users input, the program will output the respective values

        if (typeOfMoney.equalsIgnoreCase("E") && numOfDollars <= 100) {
            euros1 = (numOfDollars * euro) - ((numOfDollars * euro) * 0.10);
            System.out.println("For " + numOfDollars + " dollars, you will be able to buy " + d2.format(euros1) + " Euros");

        }

        if (typeOfMoney.equalsIgnoreCase("E") && numOfDollars > 100) {
            euros2 = (numOfDollars * euro) - ((numOfDollars * euro) * 0.05);
            System.out.println("For " + numOfDollars + " dollars, you will be able to buy " + d2.format(euros2) + " Euros");

        }

        if (typeOfMoney.equalsIgnoreCase("P") && numOfDollars <= 100) {
            pound1 = (numOfDollars * pound) - ((numOfDollars * pound) * 0.10);
            System.out.println("For " + numOfDollars + " dollars, you will be able to buy " + d2.format(pound1) + " Pound Sterlings");
        }

        if (typeOfMoney.equalsIgnoreCase("P") && numOfDollars > 100) {
            pound2 = (numOfDollars * pound) - ((numOfDollars * pound) * 0.05);
            System.out.println("For " + numOfDollars + " dollars, you will be able to buy " + d2.format(pound2) + " Pound Sterlings");
        }

        if (typeOfMoney.equalsIgnoreCase("Y") && numOfDollars <= 100) {
            yen1 = (numOfDollars * yen) - ((numOfDollars * yen) * 0.10);
            System.out.println("For " + numOfDollars + " dollars, you will be able to buy " + d2.format(yen1) + " Yen");
        }

        if (typeOfMoney.equalsIgnoreCase("Y") && numOfDollars > 100) {
            yen2 = (numOfDollars * yen) - ((numOfDollars * yen) * 0.05);
            System.out.println("For " + numOfDollars + " dollars, you will be able to buy " + d2.format(yen2) + " Yen");
        }
        //Once everything is finished the program is asking if the user wants to continue or finish.
        System.out.print("Would you like to perform more conversions?");
        String yesOrNo = input.next();
        while (!(yesOrNo.equalsIgnoreCase("yes")) && !(yesOrNo.equalsIgnoreCase("no"))) {
            System.out.print("Please Enter Yes to Continue and No to finish.");
            yesOrNo = input.next();
        }
        for (int x = 0; x < 1; ++x) {
            if (yesOrNo.equalsIgnoreCase(("yes"))) {
                System.out.print("Please enter the number of dollars you want to convert: $");
                double ammt = input.nextDouble();
                System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
                calculations(input.next(), ammt, yen, pound, euro, input);
            } else if (yesOrNo.equalsIgnoreCase("no")) {
                System.exit(0);
            }
        }

    }
}
