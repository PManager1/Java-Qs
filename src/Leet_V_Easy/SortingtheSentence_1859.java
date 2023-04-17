// Redo it // simple but
//https://leetcode.com/problems/sorting-the-sentence/

//Input: s = "is2 sentence4 This1 a3"
//        Output: "This is a sentence"
//        Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

//  4/16  at  831PM

// Comment finish it.


package Leet_V_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingtheSentence_1859 {

public static void main(String[] args) {

    String Input = "is2 sentence4 This1 a3";

//   1. figureout which digit is  at the end of a word. by using the % or /
//   2.
//   3.
//   4.


    String [] origiArray = new String[] {"abc", "def", "gef", "igk"};
    var OriginalList = Arrays.asList(origiArray);

    System.out.println("OriginalList =" +  OriginalList);
    OriginalList.set(0,"theNew");
    System.out.println("OriginalList =" +  OriginalList);




        String arr [] = Input.split(" ");

        System.out.println(".split"  +  Arrays.toString(arr) );
            var llist = Arrays.asList(arr);
        System.out.println("arr =" +  arr);


//    for loop
//    [i]  // first will be zero  [1]  === [1]  //    if [i] (1)   === last element of the string.
// save it in the new array.  ( this will be in the acending order  )
    // return this array.



                ArrayList<String> sortedList = new ArrayList<String>();


            for ( int i=0; i<arr.length; i++ ){

                System.out.println("  arr =" +  arr[i].substring(arr[i].length() - 1)  );

                sortedList.add(arr[i]);
            }

            System.out.println("sortedList =" + sortedList);


//    String Input = "is2 sentence4 This1 a3";
    String s = Input;
          String[] ans = new String[s.split(" ").length];
          for(String st: s.split(" "))
           {
               System.out.println("ans 1st = "+ ans[st.charAt(st.length()-1) - '1']);
               System.out.println("ans 2nd = "+ st.substring(0,st.length()-1 ));

               // Jay - all its donig is (on left)  taking the digit and ( on right )  putting the value into that.
                       ans[st.charAt(st.length()-1) - '1'] = st.substring(0,st.length()-1);
         }
//         return String.join(" ",ans);

    System.out.println("ans = "+ Arrays.toString(ans));


}

}
// re Look at the solution here.
// https://leetcode.com/problems/sorting-the-sentence/solutions/2965534/100-beats-java-6-lines/
