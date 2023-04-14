//https://leetcode.com/problems/shuffle-the-array/

//Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]
//        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
//
//        Input: nums = [1,2,3,4,4,3,2,1], n = 4
//        Output: [1,4,2,3,3,2,4,1]

//  4/13/23  822 pm 924 pm  - Done in 60 mins

package Leet_V_Easy;

import java.util.Arrays;

public class ShuffleTheArray {

    public static void main(String[] args) {
                              //Here
        int[] ResultArr = new int [8];
                                        //Output:  [1, 4, 2, 3, 3, 2, 4, 1]
        int [] num  = {1,2,3,4,4,3,2,1};
            int mid = 4;  //Sec


            int ResultArr_i = 0;
        int j = mid;

                            //num.length-3
            for ( int i=0; i< num.length/2 ; i++ ){
                System.out.println("start - i ="+ i);
                ResultArr[ResultArr_i] = num[i];
                                            System.out.println("start - i ="+ i);

                ResultArr_i++;   // error bc its going to value 8.
                ResultArr[ResultArr_i] = num[mid];
                ResultArr_i++;
                mid++;  //


                System.out.println("end - i ="+ i);
            System.out.println("================ ResultArr ="+ Arrays.toString(ResultArr));
            }

    }
}
