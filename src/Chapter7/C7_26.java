
package Chapter7;

import java.util.Scanner;
/**
 * 
 * @author Naveen Thavathiru
 */
public class C7_26 {
    /**
     * Main Method
     *
     * @param args arguments from the command line
     */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Tells the user to enter two lists
		System.out.print("Enter list1: ");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++)
			list1[i] = input.nextInt(); 	

		System.out.print("Enter list2: ");
		int[] list2 = new int[input.nextInt()];
		for (int i = 0; i < list2.length; i++)
			list2[i] = input.nextInt();

		// Display whether the two are strictly identical
		System.out.println("Two lists are" + (equals(list1, list2) ? " " : " not ") + "strictly identical");
	}
        /**
         * 
         * @param list1 The first list entered by the user
         * @param list2 The second list entered by the user
         * @return True of false, based on if they are identical or not
         */
	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length)
			return false;

		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i])
				return false;
		}
		return true;
	}
}

