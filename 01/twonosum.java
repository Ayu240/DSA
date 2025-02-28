

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * leetcode
 */
public class twonosum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store each element of the array along with its index
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement needed for the current number to sum up to the target

            // If the complement exists in the HashMap, return the indices of both numbers
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add the current number to the HashMap along with its index
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[] {};
    }

    public static void main(String[] args) {
       // Scanner sc=new Scanner (System.in);
        int[] nums = { 4, 12, 1, 15 };
        int target = 19;
        int[] result = twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] +"]");
            System.out.println("Values: [" + nums[result[0]] + ", " + nums[result[1]]+"]");
        } else {
            System.out.println("No solution found.");
        }
        System.out.println("target=" + target);
    }
}