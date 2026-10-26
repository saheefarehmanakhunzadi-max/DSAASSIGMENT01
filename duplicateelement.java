package TASK9;
import java.util.*;
public class duplicateelement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner object banaya
        int[] arr = new int[10]; // 10 integers ka array declare kiya
        int n = 10; // Array size
        boolean[] checked = new boolean[10]; // Ye track karega kaunsa index pehle check ho chuka hai - duplicate ek baar dikhane ke liye

        // Part 1: Takes 10 integers as input.
        System.out.println("Enter 10 integers:"); // User se input mang rahe hain
        for (int i = 0; i < n; i++) { // Loop 0 se 9 tak
            System.out.print("arr[" + i + "]= "); // Index show
            arr[i] = sc.nextInt(); // Value store
        }

        // Original array display
        System.out.print("\nOriginal array: "); // Heading
        for (int i = 0; i < n; i++) { // Display loop
            System.out.print(arr[i] + " "); // Element print
        }
        System.out.println(); // New line

        // Part 2, 3, 4: Identifies all duplicate values, Displays each duplicate only once, and count
        System.out.println("\nPart 2,3,4: Finding duplicate values..."); // Message
        boolean hasDuplicate = false; // Check karne ke liye koi duplicate hai bhi ya nahi

        for (int i = 0; i < n; i++) { // Outer loop, har element ko check karenge
            if (checked[i]) { // Agar ye index pehle hi kisi duplicate ka hissa ban chuka hai to skip karo
                continue; // Agle i par jao - ye duplicate ko ek baar dikhane ke liye hai
            }

            int count = 1; // Khud ka 1 count
            for (int j = i + 1; j < n; j++) { // Inner loop, i ke baad wale elements check karo
                if (arr[i] == arr[j]) { // Agar duplicate mila
                    count++; // Count badhaya
                    checked[j] = true; // j wale index ko marked kar diya taake dobara count na ho
                }
            }

            if (count > 1) { // Agar count 1 se zyada hai matlab duplicate hai - Part 2
                hasDuplicate = true; // Flag true
                // Part 3 & 4: Displays each duplicate value only once, and how many times it occurs
                System.out.println("Duplicate value: " + arr[i] + " occurs " + count + " times"); // Duplicate value + count
            }
        }

        if (!hasDuplicate) { // Agar koi duplicate nahi mila
            System.out.println("No duplicate values found in the array."); // Message
        }

        sc.close(); // Scanner close
    }

	}


