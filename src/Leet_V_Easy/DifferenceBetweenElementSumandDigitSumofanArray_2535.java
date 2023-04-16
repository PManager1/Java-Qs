//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/

//The element sum is the sum of all the elements in nums.
//        The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
//        Return the absolute difference between the element sum and digit sum of nums.

//Input: nums = [1,15,6,3]
//        Output: 9
//        Explanation:
//        The element sum of nums is 1 + 15 + 6 + 3 = 25.
//        The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
//        The absolute difference between the element sum and digit sum is |25 - 16| = 9.

// Do compare my following code with the solution :  https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/solutions/3310327/most-easy-solution/

package Leet_V_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenceBetweenElementSumandDigitSumofanArray_2535 {

    public static void main(String[] args) {
       int []  nums = {1,15,6,3};

        String[] array = {"a", "b", "c", "d", "e"};
        //Method 1
        List<String> list = Arrays.asList(array);
        System.out.println(list);


//        List<Integer> intList = new ArrayList<Integer>();
//                intList.add(1); intList.add(2);
//        System.out.println(intList);


//        System.out.println(al);

        System.out.println(" 15%10 "+ 15%10);
        System.out.println(" 15/10 "+ 15/10);
        System.out.println(" 1/10 "+ 1/10);

        System.out.println(" 1%10 "+ 1%10);

        digitsumOfNums(nums);

    }

    public static int digitsumOfNums(int arraypass[]  ){
        System.out.println(" arraypass ="+ Arrays.toString(arraypass)  );
//        check if the number is double digit ?  - - -  x>9

        int left_digit, right_digit;

        List<Integer> intList = new ArrayList<Integer>();
//        intList.add(1); intList.add(2);
        System.out.println(intList);

        for ( int i =0; i< arraypass.length; i++) {
            if ( arraypass[i] > 9 ) {
                 left_digit = arraypass[i]/10 ;
                        intList.add(left_digit);
                 right_digit = arraypass[i]%10 ;
                        intList.add(right_digit);
            } else {
                    intList.add(arraypass[i]);
                    System.out.println(" outside if else  arraypass[i] ="+ arraypass[i] );
            }


        }
        System.out.println(" 72---> intList ="+ intList );
        int sum =0;
        for ( int j =0; j< intList.size(); j++) {
            sum += intList.get(j);
            System.out.println("sum ="+sum);
        }

        return sum;
    }






    public static int elementSumOfNums(int Arr){

        return 0;
    }



}
