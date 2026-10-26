package TASK11;
import java.util.*;
public class TASK11 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first sorted array
        System.out.print("Enter size of first sorted array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements in ascending order:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for second sorted array
        System.out.print("Enter size of second sorted array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements in ascending order:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge without using any sorting algorithm - Two Pointer Technique
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Compare and merge
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1 if any
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2 if any
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        // Display merged sorted array
        System.out.println("Merged Sorted Array (Third Array):");
        for (int x = 0; x < merged.length; x++) {
            System.out.print(merged[x] + " ");
        }

        sc.close();
    }
}
