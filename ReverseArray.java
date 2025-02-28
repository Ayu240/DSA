// TCS smar hiring question

import java.util.Scanner;

public class ReverseArray {

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr) {
        // Reverse the array using the two-pointer approach
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // If the array length is even, split and print in two parts.
        if (arr.length % 2 == 0) {
            int mid = arr.length / 2;
            System.out.print("First half: [ ");
            for (int i = 0; i < mid; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.print("] ");
            // System.out.println();

            System.out.print("Second half: [ ");
            for (int i = mid; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");
            System.out.println();
        } else {
            // For odd-length arrays, simply print the reversed array
            System.out.print("Reversed array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Function to read the array from user input
    public static int[] inputArray(Scanner sc) {
        System.out.print("Size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the array
        int[] arr = inputArray(sc);

        // Display the original array
        System.out.print("Original array: ");
        display(arr);

        // Reverse the array
        reverse(arr);

        // Display the reversed array
        // System.out.print("Reversed array: ");
        // display(arr);

        sc.close();
    }
}
