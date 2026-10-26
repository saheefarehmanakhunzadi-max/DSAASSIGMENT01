package TASK4;
import java.util.*;

public class numbernotfound {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object banaya
        int[] arr = new int[10]; // 10 integers ka array declare kiya

        // Array Input
        System.out.println("Enter 10 integers:"); // User se 10 numbers mang rahe hain
        for (int i = 0; i < arr.length; i++) { // Loop 0 se 9 tak
            System.out.print("arr[" + i + "]= "); // Index dikha rahe hain
            arr[i] = sc.nextInt(); // Value array me store
        }

        // Number to search
        System.out.print("\nEnter number to search: "); // Search wala number
        int target = sc.nextInt(); // Target me store

        // Task 4 Logic - Part 1, 2, 3 combined
        boolean isFound = false; // Flag, check karega number mila ya nahi - Part 3 ke liye zaroori hai
        int count = 0; // Kitni baar mila wo count karne ke liye

        System.out.print("Searching... \n"); // Searching message

        // Part 1 & 2: Linear search karke saare indices dhoondna
        for (int i = 0; i < arr.length; i++) { // Poora array check karenge
            if (arr[i] == target) { // Agar element match karta hai
                if (count == 0) { // Pehli baar milne par heading print karo
                    System.out.print("Number " + target + " found at indices: ");
                }
                System.out.print(i + " "); // Index print karo - Part 2
                isFound = true; // Flag true
                count++; // Count badhaya
            }
        }

        System.out.println(); // Line break

        // Part 3: Appropriate message if not found
        if (!isFound) { // Agar isFound abhi bhi false hai, matlab loop me ek baar bhi match nahi hua
            // Yehi Part 3 ka main logic hai
            System.out.println("Result: Number " + target + " is NOT found in the array."); // Appropriate not found message
            System.out.println("The array does not contain " + target + "."); // Extra clear message
        } else { // Agar mil gaya hai
            System.out.println("Result: Number " + target + " found " + count + " time(s)."); // Kitni baar mila
        }

        sc.close(); // Scanner close
    }


	}


