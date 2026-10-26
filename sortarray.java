package TASK8;
import java.util.*;
public class sortarray {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); // Scanner object banaya
	        int[] arr = new int[10]; // 10 integers ka array declare kiya
	        int n = 10; // Array ka size 10 hai

	        // Input: 10 integers lena
	        System.out.println("Enter 10 integers:"); // User se input mang rahe hain
	        for (int i = 0; i < n; i++) { // Loop 0 se 9 tak
	            System.out.print("arr[" + i + "]= "); // Index dikha rahe hain
	            arr[i] = sc.nextInt(); // Value array me store kar rahe hain
	        }

	        // Original array display
	        System.out.print("\nOriginal array: "); // Heading
	        for (int i = 0; i < n; i++) { // Display loop
	            System.out.print(arr[i] + " "); // Element print
	        }
	        System.out.println(); // New line

	        // Part 1: Sorts the array in ascending order using Bubble Sort.
	        for (int i = 0; i < n - 1; i++) { // Outer loop - n-1 passes ke liye
	            for (int j = 0; j < n - 1 - i; j++) { // Inner loop - adjacent compare karne ke liye
	                if (arr[j] > arr[j + 1]) { // Agar pehla bada hai dusre se
	                    int temp = arr[j]; // Temp me pehla save kiya
	                    arr[j] = arr[j + 1]; // Dusra pehle par laaye
	                    arr[j + 1] = temp; // Pehla dusre par laaye - Swap
	                }
	            }
	        }

	        // Part 2: Displays the sorted array.
	        System.out.print("\nPart 2: Ascending order: "); // Ascending heading
	        for (int i = 0; i < n; i++) { // Loop for display
	            System.out.print(arr[i] + " "); // Sorted element print
	        }
	        System.out.println(); // New line

	        // Part 3: Displays the array in descending order.
	        System.out.print("\nPart 3: Descending order: "); // Descending heading
	        for (int i = n - 1; i >= 0; i--) { // Loop ulta n-1 se 0 tak
	            System.out.print(arr[i] + " "); // Element print descending me
	        }
	        System.out.println(); // New line

	        sc.close(); // Scanner close
	    }

	
	}


