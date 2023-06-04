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

import java.util.HashMap;

public class TwoNumberSum_1 {

    public static void main(String[] args) {

        int [] arr = { 3, 5, -4, 8, 11, 1, -1, 6 };  // 10
//        int [] arr = { 3, 1, -4, 8, 11, 5, -1, 6 };  // 10
        int targetSum = 10;

//        computeFn( int[] array, targetSum);
          int res =   computeFn(arr, targetSum );
        System.out.println("res =" + res);

    }

    public static int computeFn (int[] arr, int targetSum ){
//        public static int computeFn ( ){

//        var ht = new Hashtable<>();
//        HashMap<Integer, Boolean> ht = new HashMap<>();
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
