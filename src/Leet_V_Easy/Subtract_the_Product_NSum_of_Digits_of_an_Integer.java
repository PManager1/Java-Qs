package Leet_V_Easy;

// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

//Input: n = 234
//        Output: 15
//        Explanation:
//        Product of digits = 2 * 3 * 4 = 24
//        Sum of digits = 2 + 3 + 4 = 9
//        Result = 24 - 9 = 15
// Must Redo   4/15/23

import java.util.ArrayList;

public class Subtract_the_Product_NSum_of_Digits_of_an_Integer {

    public static void main(String[] args) {

        int numbr  = 234;

        System.out.println("numbr len =" + numbr%10 ); //4
        System.out.println("numbr len =" + 23%10 ); //3


        System.out.println("numbr len =" + numbr%100 ); //34

        int res;
        int sum=0; int prod=1;
        ArrayList<Integer> arr = new ArrayList<>();

        //        numbr  = 234;
        while(numbr != 0){
            res = numbr%10;  // 4
            numbr /= 10; //23
            arr.add(res);
            System.out.println("arr =" + arr );
        }


//        Produt of digits
        int product =1; int Sum = 0;
            for ( int i =0; i<arr.size(); i++ ){

                product *= arr.get(i);
            }


//        sum of digits

        for ( int i =0; i<arr.size(); i++ ){

            Sum += arr.get(i);
        }

        System.out.println("product =" + product );
        System.out.println("Sum =" + Sum );
//        product - sum

        int Result = product - sum;
        System.out.println("Result =" + Result );
    }
}
