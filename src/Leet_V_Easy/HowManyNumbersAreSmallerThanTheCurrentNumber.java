
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

//Given the array nums, for each nums[i]
// find out how many numbers in the array are smaller than it.
// That is, for each nums[i] you have to count the number of valid j's such that
// j != i and nums[j] < nums[i].


//Input: nums = [8,1,2,2,3]
//        Output: [4,0,1,1,3]
//        Explanation:
//        For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//        For nums[1]=1 does not exist any smaller number than it.
//        For nums[2]=2 there exist one smaller number than it (1).
//        For nums[3]=2 there exist one smaller number than it (1).
//        For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
//

// 4/15/23  Maybe try with hashmap
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/solutions/535421/java-clean-hashmap-solution-with-explanation/

package Leet_V_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int [] nums = {8, 1, 2, 2, 3};

    // create a list array
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(4);
//
//        System.out.println(" list =" + list);

        // find out how many numbers in the array are smaller than it.
        for ( int i =0; i<nums.length; i++){
            // find out how many numbers in the array are smaller than it.
        }
        List<Integer> numbers = Arrays.asList(8, 1, 2, 2, 3);

//        List<Integer> numss = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//        Integer[] numbers = new Integer[] { 1, 2, 3 };
//        List<Integer> list = Arrays.asList(numbers);


        List<Integer> tempArray = Arrays.asList();

//        numbers.forEach(number-> {
//            // find out how many numbers in the array are smaller than it.
//                    System.out.println(number);
//                    int self = number;
//                });

            for ( int i=0; i<numbers.size(); i++){
        // find out how many numbers in the array are smaller than it.
                System.out.println("i =" + i );
                System.out.println("numbers[i] ==================" + numbers.get(i) );

                int count = 0;
                int currentElement =  numbers.get(i);
// {8, 1, 2, 2, 3};
                for ( int j=0; j<numbers.size(); j++) {
                // find out how many numbers in the array are smaller than it.
                    if ( currentElement > numbers.get(j) ){
                        count += 1;
                    }

                }
                System.out.println("Count number of elements that are greater =" + count );
                }
            }

    }

