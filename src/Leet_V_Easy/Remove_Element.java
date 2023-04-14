//Given an integer array nums and an integer val,
// remove all occurrences of val in nums in-place. The order of the elements may be changed.
// Then return the number of elements in nums which are not equal to val.
// 4/13/23  4:11
//https://leetcode.com/problems/remove-element/description/

//Input: nums = [3,2,2,3], val = 3
//        Output: 2, nums = [2,2,_,_]

//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//        Output: 5, nums = [0,1,4,0,3,_,_,_]

package Leet_V_Easy;

import java.util.Arrays;

public class Remove_Element {
    public static void main(String[] args) {

        int[] nums = {3,2,2,3};
         int val_to_Remove = 3;
         int count=0;

        System.out.println("initial nums ="+ Arrays.toString(nums));

         for ( int i=0; i< nums.length; i++){

             System.out.println("iteration i ="+ i );

//             if  value == 3, continue;
                 // else  insert in the new array. Keep seperate iterator for newArray.

             if ( nums[i] != val_to_Remove ) {
                 nums[count++] = -1;
                 System.out.println("if nums ="+ Arrays.toString(nums));
                 continue;
             } else {
//                        temp != nums[i];
//                        nums[j] = nums[i];
//                        j++;
             }

         }
        System.out.println("nums ="+ Arrays.toString(nums));


    }
}
