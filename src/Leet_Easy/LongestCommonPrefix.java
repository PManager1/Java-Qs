//https://leetcode.com/problems/longest-common-prefix/
//https://leetcode.com/problems/longest-common-prefix/
//Write a function to find the longest common prefix string amongst an array of strings.

//Input: strs = ["flower","flow","flight"]
//  Output: "fl"

package Leet_Easy;

public class LongestCommonPrefix {


    public static void main(String[] args) {
        String[] arr = new String[]{"flower", "flow", "flight"};

        String stringAdder = "";
        String s1 = arr[0];
        String s2 = arr[1];
        String s3 = arr[2];

        int idx = 0;

            while( idx < s1.length() && idx < s1.length() ) {

//            check for the first char of the string,
//                        arr[i].charAt(0);
                   if(s1.charAt(idx) == s2.charAt(idx)){
                        stringAdder += s1.charAt(idx);
//            if its same, put it in the stringAdder
                        System.out.println("stringAdder " + stringAdder );
                idx++;
            } else {
                        System.out.println("Else statement "  );
                        break;
                    }

        }


    }
}


