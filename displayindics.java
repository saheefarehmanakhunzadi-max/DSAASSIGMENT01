package TASK4;
import java.util.*;
public class displayindics {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object banaya
        int[] arr = new int[10]; // 10 integers ka array declare kiya

        // Array Input
        System.out.println("Enter 10 integers:"); // User se 10 numbers mang rahe hain
        for (int i = 0; i < arr.length; i++) { // Loop 0 se 9 tak
            System.out.print("arr[" + i + "]= "); // Index show kar rahe hain
            arr[i] = sc.nextInt(); // Value array me store
        }

        // Number to search
        System.out.print("\nEnter number to search: "); // Search number ka input
        int target = sc.nextInt(); // Target me store kiya

        // Part 2 Logic: Saare indices nikalna
        boolean isFound = false; // Flag, check karega mila ya nahi
        System.out.print("Number " + target + " found at indices: "); // Output heading

        for (int i = 0; i < arr.length; i++) { // Poora array 0 se end tak check karenge - Linear Search
            if (arr[i] == target) { // Agar current element target ke barabar hai
                System.out.print(i + " "); // Uska index print kar do - Yehi Part 2 hai
                isFound = true; // Flag true kar diya, break nahi karenge taake saare indices mil jayen
            }
        }

        // Agar ek bhi baar nahi mila toh Part 2 me kuch print nahi hoga, isliye next part me message ayega
        if (!isFound) { // Agar kahin bhi nahi mila
            System.out.print("None"); // Koi index nahi hai
        }
        System.out.println(); // New line

        sc.close(); // Scanner close
    }


	}


