package stephen;

//https://leetcode.com/problems/valid-anagram/
//        Input: s = "anagram", t = "nagaram"
//        Output: true
//
//        Input: s = "rat", t = "car"
//        Output: false
//
//        Given two strings s and t, return true if t is an anagram of s,
//        and false otherwise.
//
//        An Anagram is a word or phrase formed by rearranging the
//        letters of a different word or phrase, typically using all the original letters exactly once.
// 4/18  552

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
//    split each word into its characters.
//    sort it in one order
//    one order shoudl be equal to other order.

        String st1 = "anagram";
        String st2 = "nagaram";

        System.out.println(" split " + st1.split(""));

        String[] sorted_ar1 = st1.split("");
        String[] sorted_ar2 = st2.split("");

         Arrays.sort(sorted_ar1);
        Arrays.sort(sorted_ar2);


        System.out.println(" all parts Asc   "  +  sorted_ar1 );


        for (int i = 0; i < sorted_ar1.length; i++){
            System.out.println(" all parts  " + sorted_ar1[i] + sorted_ar2[i] );
        }

        System.out.println("is arr1 equals to arr2 : " +
                Arrays.equals(sorted_ar1, sorted_ar2));



//        String string = "004-034556";
//        String[] parts = string.split("-");
//        String part1 = parts[0]; // 004
//        String part2 = parts[1]; // 034556
//        System.out.println(" part1 " + part1 );
//        System.out.println(" part2 " + part2 );

    }

}
