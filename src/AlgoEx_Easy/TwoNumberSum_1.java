package AlgoEx_Easy;

// Two number sum.
//No number in this arrraay is repeated.  { 3, 5, -4, 8, 11, 1, -1, 6 }, 10
//also give you a target sum = 10.
//wap - to find whether or not there is a pair of numbers that  sums up to the target sum.

//Find if there is a

//requires mind. but cna be done.

//algo, first sort it.  min to max.
// then keep increasing the pointer from left to right. depending on the target.

//Fix it :  why are they putting the values in teh map incrementaly  , not like how i did it
//https://www.youtube.com/watch?v=TcsYEnMrnFo

//Fix it: Find all the numbers, not just one.
// Figure out :  if array is passed, how do you convert it into the list ?

// Debug : using pointers is given in 3.pdf
//June 3 with hash, not right here is rt https://www.youtube.com/watch?v=TcsYEnMrnFo

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoNumberSum_1 {

    public static void main(String[] args) {

//        int [] arr = { 3, 5, -4, 8, 11, 1, -1, 6 };  // 10
//        int [] arr = { 3, 1, -4, 8, 11, 5, -1, 6 };  // 10
        int [] arr = { 3, 5, 4, 8, 11, 1, 1, 6 };  // 10
        int targetSum = 10;

//                                            List<Integer> strings = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//                                            List<Integer> listArr = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);

//        int res =   computeFn(arr, targetSum );
        int [] res =   computePointersFn(arr, targetSum );
        System.out.println("res =" + res);
    }

    public static int [] computePointersFn ( int [] arr, int targetSum ) {

        Arrays.sort(arr);

        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print( " "+ num );
        }  // int [] arr = { -4 -1 1 3 5 6 8 11 };  //Target = 10;

        int left = arr[0], right = arr.length-1;

        // Traverse while ( left < right )
        // check if lft + rght = target;
        // if not

//        while ( left < right){
//            int sum = arr[left] + arr[right];
//            if( sum == targetSum) {   return new int [] {arr[left] ,arr[right]};  }
//            else if (sum < targetSum ) { left ++;    }
//            else if (sum > targetSum ) {  right--;   };
//        }


        while (left < right) {
             int currentSum = arr[left] + arr[right];
             if (currentSum == targetSum) {
                 return new int[] { arr[left], arr[right]};
             } else if (currentSum < targetSum) {  left ++; }
             else if (currentSum > targetSum) {  right --; }
             }

        return new int [0];

    }


    public static int computeFn (int[] arr, int targetSum ){
         HashMap<Integer,Boolean> hm=new HashMap<Integer,Boolean>();
         for (int i = 0; i <arr.length; i++) {
             hm.put( arr[i], true);
         }
//         System.out.println("29--hm =" + hm);
//         System.out.println("29--hm ="+ hm.containsKey(3));

            int result [];
         for (int i = 0; i < arr.length; i++) {
             System.out.println("46 entering for loop i=" + i);
             int findNum = targetSum - arr[i];
             if ( hm.containsKey(findNum) )  {
                 System.out.println("yes found ="+ arr[i]);
                 return arr[i];
             }


         }
        return 0;
    }
}
