package TASK4;
import java.util.*;
public class LINEARSEARCH {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; // 10 size ka integer array declare kiya

        // Step 1: Array input
        System.out.println("Enter 10 integers:"); 
        for (int i = 0; i < arr.length; i++) { 
            System.out.print("arr[" + i + "]= "); 
            arr[i] = sc.nextInt(); 
        }

        // Step 2: Number to search input
        System.out.print("\nEnter number to search: "); // Search wala number manga
        int target = sc.nextInt(); // Target variable me store kiya

        // Step 3: Part 1 - Linear Search Logic
        boolean isFound = false; // Flag check karne ke liye mila ya nahi
        int foundIndex = -1; // Pehla index store karne ke liye

        for (int i = 0; i < arr.length; i++) { // Linear search: ek ek element check
            if (arr[i] == target) { // Agar element target ke barabar hai
                foundIndex = i; // Index save kar liya - Part 1 complete
                isFound = true; // Flag true kar diya
                break; // Part 1 me sirf pehli baar milte hi ruk jayenge (linear search ka basic rule)
            }
        }

        // Part 1 ka result display
        if (isFound) { // Agar mil gaya
            System.out.println("Part 1 Result: Number " + target + " found at index " + foundIndex + " using Linear Search.");
        } else { // Agar nahi mila
            System.out.println("Number not found.");
        }

        sc.close(); // Scanner close
    }

	}


