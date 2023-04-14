//Build Array from Permutation
//https://leetcode.com/problems/build-array-from-permutation/

//Input: nums = [0,2,1,5,3,4]
//        Output: [0,1,2,4,5,3]
//        Explanation: The array ans is built as follows:
//                                                     1
//        ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]],

// Solved but took time to understan : I need to create a seperate duplicate array .

package Leet_V_Easy;

import java.util.Arrays;

public class Build_Array_from_Permutation {

    public static void main(String[] args) {

        int original [] = {0,2,1,5,3,4};
        int nums [] = {0,2,1,5,3,4};

        for ( int i=0; i<nums.length; i++){
            int temp = original[i];
            temp = original[temp];
            nums[i] = temp;

            System.out.println("====================="+ i );
            System.out.println("temp="+ temp );
            System.out.println("result="+ Arrays.toString(nums));
        }

        System.out.println("result="+ Arrays.toString(nums));
    }



}
