package TASK6;
import java.util.*;
public class deleteelement {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object banaya
        int[] arr = new int[10]; // 10 integers ka array declare kiya
        int n = 10; // Array ka current size, delete ke baad 9 ho jayega

        // Step 0: Initial Array Input
        System.out.println("Enter 10 integers:"); // User se 10 numbers mang rahe hain
        for (int i = 0; i < n; i++) { // Loop 0 se 9 tak input ke liye
            System.out.print("arr[" + i + "]= "); // Index show kar rahe hain
            arr[i] = sc.nextInt(); // Value array me store kar rahe hain
        }

        // Original Array Display
        System.out.print("\nOriginal array (n=" + n + "): "); // Heading
        for (int i = 0; i < n; i++) { // Display ke liye loop
            System.out.print(arr[i] + " "); // Element print
        }
        System.out.println(); // New line

        // Part 1: Asks the user to enter an index.
        System.out.print("\nEnter index to delete (0 to 9): "); // User se index manga - Part 1
        int delIndex = sc.nextInt(); // Index ko variable me store kiya

        // Validation for Part 1
        if (delIndex < 0 || delIndex >= n) { // Check kar rahe hain index valid hai ya nahi
            System.out.println("Invalid index! Index must be between 0 and 9"); // Error message
            sc.close(); // Scanner close
            return; // Program yahin khatam
        }

        // Part 2: Deletes the element at that index.
        System.out.println("\nPart 2: Deleting element at index " + delIndex); // Message
        System.out.println("Element to be deleted: " + arr[delIndex]); // Kaunsa element delete ho raha hai - Part 2
        int deletedValue = arr[delIndex]; // Deleted value ko save kiya

        // Part 3: Shifts the remaining elements to the left.
        // Ye loop delIndex se start hoke n-2 tak chalega aur agla element pichhe laayega
        for (int i = delIndex; i < n - 1; i++) { // Loop delIndex se n-2 tak - Part 3 main logic
            arr[i] = arr[i + 1]; // Agla element pichhle index par shift kar diya - Left Shift
        }

        n--; // Size 1 kam kar diya kyunki ek element delete ho gaya - Part 2 complete

        // Part 4: Displays the updated array.
        System.out.println("\nElement " + deletedValue + " deleted successfully!"); // Success message
        System.out.print("Updated array after deletion (n=" + n + "): "); // Updated array heading - Part 4
        for (int i = 0; i < n; i++) { // Naye size n=9 tak display karenge
            System.out.print(arr[i] + " "); // Updated element print - Part 4
        }
        System.out.println(); // New line

        sc.close(); // Scanner close kiya
    }


	}


