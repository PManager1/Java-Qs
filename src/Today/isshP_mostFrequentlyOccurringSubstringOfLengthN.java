package Today;

//Give the candidate a string (e.g. "inengineering") and ask them to write a method of signature
// (string str, int n) -> string that returns the most frequently occurring substring of length n in str.
//
//        For example, with str equal to "inengineering" and n = 2, the substrings would be:
//
//        in, ne, en, ng, gi, in, ne, ee, er, ri, in, ng
//        and the most frequently occurring substring is in.

import java.util.HashMap;

public class isshP_mostFrequentlyOccurringSubstringOfLengthN {
    public static void main(String[] args) {
        WorkTheString();
    }

    public static void WorkTheString(){
        System.out.println(" method calld  ");

        String str = "inengineering";
        int n = 2;

//        returns the most frequently occurring substring of length 2

// step 1: we will break the large string into len of two characters  :    in, ne, en, ng, gi, in, ne, ee, er, ri, in, ng


        // step 2:  figure out which one have the maximum count.  use Hashmaps.

        HashMap<String, Integer> Result = new HashMap<>();

        // add elements to hashmap
        Result.put("Java", 8);
        Result.put("JavaScript", 1);
        Result.put("Python", 3);
        System.out.println("HashMap: " + Result);

        System.out.println("HashMap: " + Result);
        System.out.println("HashMap: languages.get a  " + Result.get("Java"));

        System.out.println("containsKey: " + Result.containsKey ("Java"));
        System.out.println("containsValue : " + Result.containsValue(62));

        //

    }
}
