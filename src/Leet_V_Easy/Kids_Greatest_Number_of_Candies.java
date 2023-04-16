//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

//Input: candies = [2,3,5,1,3], extraCandies = 3
//        Output: [true,true,true,false,true]
//        Explanation: If you give all extraCandies to:
//        - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//        - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//        - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//        - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//        - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

//simple can be done.without looking.

//Return a boolean array result of length n, where result[i] is true if,
// after giving the ith kid all the extraCandies, they will have the
// greatest number of candies among all the kids, or false otherwise.
//on 4/15/23  3:01 // took an hour of looking and fixing // not sure if its best solution

package Leet_V_Easy;

import java.util.*;

public class Kids_Greatest_Number_of_Candies {
    public static void main(String[] args) {

         int [] candies = {2,3,5,1,3};
        ArrayList <Integer> arr = new ArrayList <Integer>(Arrays.asList(2,3,5,1,3));

        List<Integer> originalArr = new ArrayList<>(arr);

        int extraCandies = 3;

        System.out.println("  arr ="+ arr  );

                arr.sort(Comparator.naturalOrder());
            System.out.println("arr after sorted   "+ arr    );
            arr.get(0);

           int greatest = arr.get(arr.size()-1);


            for ( int i =0; i< originalArr.size(); i++){
                    System.out.println( "i = "+  originalArr.get(i) );
                int pointer = originalArr.get(i);

                if (  pointer + extraCandies  >= greatest ){
                    System.out.println(" return = true ");
                }  else{
                    System.out.println(" return = false ");
                }
            }




    }
}
