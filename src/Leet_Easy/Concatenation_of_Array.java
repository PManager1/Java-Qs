//https://leetcode.com/problems/concatenation-of-array/
// 5/13/23
//Input: nums = [1,2,1]
//        Output: [1,2,1,1,2,1]

package Leet_Easy;

import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int nums[] = {1, 2, 1};

        int newArr[] = {0, 0, 0, 0, 0, 0};

        for ( int i =0; i< nums.length*2; i++ ){
            System.out.println("i =" + i );
//            System.out.println("nums.length =" + nums.length );

            if ( i < nums.length){
                newArr[i] = nums[i];
                System.out.println("first-newarr ="+ Arrays.toString(newArr));
            } else {
                newArr[i] =         nums[i-nums.length];
                System.out.println("sec-newarr ="+ Arrays.toString(newArr));
            }


        }

            System.out.println("newarr ="+ newArr);

    }
}
