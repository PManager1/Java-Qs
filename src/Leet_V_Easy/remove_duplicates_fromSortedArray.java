//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

// by jay -you can replace the empty cells with -1;

// 4/13/23
// Good Try again , i couldn't solve it.
// redo it

package Leet_V_Easy;

import java.util.Arrays;

public class remove_duplicates_fromSortedArray {
    public static void main(String[] args) {

        int[] nums =  {0,0,1,1,1,2,2,3,3,4};

        System.out.println("15  ----> nums ="+ Arrays.toString(nums));

        int newIndex = 1; // Start with index 1 because the first element is already in place

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i+1]) { // If the current element is less than the next element

                nums[newIndex] = nums[i+1]; // Move the next element to the new index
                newIndex++; // Increment the new index
            }
        }
        System.out.println("23  ----> nums ="+ Arrays.toString(nums));

    }
}
