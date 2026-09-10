import java.util.Scanner;

/*
Description: This program performs a recursive binary search
             using an array entered by the user.
             It also displays the recursive search trace.

Programmed by: Kier Andrew R. Costumban, BS-IT, 48079, DSA

Last Modified: September 9, 2026

Version: 1.0

Acknowledgements: Laboratory Activity - Recursion,
                  Binary Search instructions provided by the instructor,
                  and AI assistance using ChatGPT (GPT-5.6 Luna).
*/

public class BinarySearch {

    public static int binarySearch(int[] array, int low, int high, int target) {

        System.out.println();
        System.out.println("binarySearch(" + low + ", " + high + ", " + target + ")");

       
        if (low > high) {
            System.out.println("Low: " + low);
            System.out.println("High: " + high);
            System.out.println("Target not found.");
            return -1;
        }

      
        int mid = (low + high) / 2;

       
        System.out.println("Low: " + low);
        System.out.println("High: " + high);
        System.out.println("Mid: " + mid);
        System.out.println("Array[Mid]: " + array[mid]);

        if (array[mid] == target) {
            System.out.println("Action: Target found.");
            return mid;
        }

       
        if (target < array[mid]) {
            System.out.println("Action: Search left half.");
            return binarySearch(array, low, mid - 1, target);
        }

        
        System.out.println("Action: Search right half.");
        return binarySearch(array, mid + 1, high, target);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        System.out.print("Number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

       
        System.out.println("Enter the elements in ascending order:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            array[i] = sc.nextInt();
        }

       
        System.out.print("Target: ");
        int target = sc.nextInt();

        System.out.println();
        System.out.println("===== RECURSIVE BINARY SEARCH TRACE =====");

       
        int result = binarySearch(array, 0, n - 1, target);

        System.out.println();
        System.out.println("===== SEARCH RESULT =====");

        if (result != -1) {
            System.out.println("Target found.");
            System.out.println("Index: " + result);
        } else {
            System.out.println("Target not found.");
            System.out.println("Index: -1");
        }

        sc.close();
    }
}