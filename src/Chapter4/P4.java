package Chapter4;

import java.util.Scanner;

/**
 * With user input, find out the winner between two bids and displays the winner
 * with the total cost.
 *
 * @author Naveen Thavathiru
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter your name: ");
        String character1 = input.next();

        System.out.println("How many hours of work will you require? ");
        int hours = input.nextInt();

        System.out.println("How much do you charge per hour? ");
        double charges1 = input.nextDouble();

        System.out.println("Please enter your name: ");
        String character2 = input.next();

        System.out.println("How many hours of work will you require? ");
        int hours2 = input.nextInt();

        System.out.println("How much do you charge per hour? ");
        double charges2 = input.nextDouble();

        double firstcost = hours * charges1;
        double secondcost = hours2 * charges2;

        if (firstcost < secondcost) {
            System.out.printf("\n The winner is %s! The total cost is $ %.2f ", character1, firstcost);
        } else if (secondcost < firstcost) {
            System.out.printf("\n The winner is %s! The total cost is $ %.2f ", character2, secondcost);
        } else if (firstcost == secondcost && hours < hours2) {
            System.out.println("The winner is " + character1);
            System.out.printf("\n Total cost is $ %.2f ", firstcost);
            System.out.println("The number of hours is " + hours);
        } else if (firstcost == secondcost && hours2 < hours) {
            System.out.println("The winner is " + character2);
            System.out.printf("\n Total cost is $ %.2f ", secondcost);
            System.out.println("The number of hours is " + hours2);

        } else {
            System.out.println(character1 + " and " + character2 + " have identical bids.");
            System.out.println("Number of hours: ");
            System.out.println("First Bidder = " + hours);
            System.out.println("Second Bidder = " + hours);
            System.out.println("Cost per hour: ");
            System.out.printf("\n First Bidder = %.2f$", charges1);
            System.out.printf("\n Second Bidder = %.2f$", charges2);
            System.out.println("Total Cost: ");
            System.out.printf("\n First Bidder = %.2f$", firstcost);
            System.out.printf("\n Second Bidder = %.2f$", secondcost);

        }

    }
}
