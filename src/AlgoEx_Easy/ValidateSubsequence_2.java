package AlgoEx_Easy;

//https://www.algoexpert.io/questions/validate-subsequence

// Given two non-empty arrays of integers,
// write a function that determines whether the second array
// is a subsequence of the first one.

// Numbers and the order matters.

// array =  = [5, 1, 22, 25, 6, -1, 8, 10];
//sequence =  = [1, 6, -1, 10];

// basically copied from 2.pdf.

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence_2 {
    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10 );

        https://www.java67.com/2015/10/how-to-declare-arraylist-with-values-in-java.html#ixzz83diuzTCu

         usingForLoopFn(array,  sequence);
//        System.out.println("boolean res = res =" + res);
        boolean res2 = usingPointerFn();
//        System.out.println("res2 =" + res2);

        boolean res3 = usingForLoopFn(array,  sequence);
        System.out.println("res3 =" + res2);
    }

    public static boolean usingForLoopFn(List<Integer> array, List<Integer> sequenceAr){
//        System.out.println("36-array =" + array);
//        System.out.println("37 sequenceAr =" + sequenceAr);

        int seqId=0 ;
        for (int i = 0 ; i < array.size(); i++) {
                if ( seqId == array.size() ) { break; }

                      if ( sequenceAr.get(seqId) == array.get(i) ) {
                          // good
                          seqId++;
                          continue;
                      }
//                return false;

        }

       return (seqId == sequenceAr.size()) ;


    }
    public static boolean usingPointerFn(){
        return false;
    }
}


