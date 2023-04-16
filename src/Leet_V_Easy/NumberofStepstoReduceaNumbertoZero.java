//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

//Given an integer num, return the number of steps to reduce it to zero.
// In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
//4/15- solved mostly myself.
package Leet_V_Easy;

public class NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {


        int num = 14;
        System.out.println(" 13 zero  num= " + num);
//        for loop as long as the number is equals or less than 0
        int counter =0;
        while (num > 0) {
            System.out.println("16 its zero  num= " + num);
//            Operation(num);
            counter++;
            System.out.println("20-- counter= " + counter);
            num = Operation(num);
        }
    }


    public static int Operation(int n) {
//                if num even      //      divide by 2
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(" even  n= " + n);
                return n;
            }
//                else Odd   -   sub 1 from it
            else {
                n = n - 1;
                System.out.println(" Odd  n= " + n);
                return n;
            }

}
}
