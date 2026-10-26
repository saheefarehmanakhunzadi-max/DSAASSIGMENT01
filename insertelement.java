package TASK5;
import java.util.*;
public class insertelement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner object banaya
        int[] arr = new int[11]; // 11 size ka array banaya, 10 + 1 extra for insertion
        int n = 10; // Current size 10 hai

        // Array Input
        System.out.println("Enter 10 integers:"); // User se 10 numbers mang rahe hain
        for (int i = 0; i < n; i++) { // Loop 0 se 9 tak
            System.out.print("arr[" + i + "]= "); // Index show
            arr[i] = sc.nextInt(); // Value store
        }

        // Original Array Display
        System.out.print("\nOriginal array (n=" + n + "): "); // Heading
        for (int i = 0; i < n; i++) { // Display loop
            System.out.print(arr[i] + " "); // Element print
        }

        // Part 1: Ask for index and number
        System.out.print("\n\nEnter index to insert at (0 to " + n + "): "); // Index manga - Part 1
        int insertIndex = sc.nextInt(); // Index store

        System.out.print("Enter new number to insert: "); // Naya number manga
        int newNumber = sc.nextInt(); // Naya number store

        // Validation
        if (insertIndex < 0 || insertIndex > n) { // Check valid hai ya nahi
            System.out.println("Invalid index! Must be 0 to " + n); // Error message
            sc.close(); // Close
            return; // Exit
        }

        // Part 2: Shifts the necessary elements to the right
        for (int i = n - 1; i >= insertIndex; i--) { // Loop ulta n-1 se insertIndex tak
            arr[i + 1] = arr[i]; // Element ko ek jagah aage shift kiya - Right Shift - Part 2
        }

        // Part 3: Insert the new number and display the updated array - MAIN PART
        arr[insertIndex] = newNumber; // Naye number ko khali hui jagah par insert kar diya - Part 3
        n++; // Size 1 badha diya, ab n=11 ho gaya - Part 3

        System.out.println("\nSuccessfully inserted " + newNumber + " at index " + insertIndex); // Success message

        // Updated array display
        System.out.print("Updated array (n=" + n + "): "); // Updated heading - Part 3
        for (int i = 0; i < n; i++) { // Naye size tak display karenge
            System.out.print(arr[i] + " "); // Updated element print kar rahe hain
        }
        System.out.println(); // New line


	}

}
