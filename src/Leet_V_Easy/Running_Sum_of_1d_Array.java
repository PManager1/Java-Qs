package Leet_V_Easy;

// https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

//Input: nums = [1,2,3,4]
//        Output: [1,3,6,10]
//4/14/23   Try agian, couldnt think at first.
public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4};

        for ( int i=1; i<nums.length; i++) {
                nums[i] = nums[i] +  nums[i-1];

        }

        System.out.println("nums="+ Arrays.toString(nums));

    }
}
