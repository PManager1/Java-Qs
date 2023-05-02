package Today;

//Give the candidate a string (e.g. "inengineering") and ask them to write a method of signature
// (string str, int n) -> string that returns the most frequently occurring substring of length n in str.
//
//        For example, with str equal to "inengineering" and n = 2, the substrings would be:
//
//        in, ne, en, ng, gi, in, ne, ee, er, ri, in, ng
//        and the most frequently occurring substring is in.

//Jay try the same program by changing it with n = 3, 4, 5 etc, it shouldnt break.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class isshP_mostFrequentlyOccurringSubstringOfLengthN {
    public static void main(String[] args) {
        WorkTheString();
    }

    public static void WorkTheString(){
        System.out.println(" method calld  ");

        String str = "inengineering";
        int n = 2;

        String [] strArr = str.split("");

        List<String> chunk = new ArrayList<String>();
        List<String> Doubles = new ArrayList<String>();

//        "inengineering"
//        in, ne, en, ng, gi, in, ne, ee, er, ri, in, ng

// step 1: we will break the large string into len of two characters  :    in, ne, en, ng, gi, in, ne, ee, er, ri, in, ng

        for (int i = 0, j=i+2 ; i < str.length()-1; i++ ){
            System.out.println("36----- str  = " + str );
            System.out.println("36----- i  = " + i );
                String temp = str.substring(i,j);

            System.out.println("34----- temp  = " + temp );
            System.out.println("35----- str  = " + str );
            //   push it in the  Doubles
                Doubles.add(temp);
            System.out.println("44----- Doubles  = " + Doubles );
            j++;
        }


        HashMap<String, Integer> Result = new HashMap<>();

//      Put each one in the Hashmap.
        for ( int i =0; i< Doubles.size(); i++){

            if ( Result.containsKey(Doubles.get(i) ) ){
                System.out.println("58--it contains Key  : " + Doubles.get(i) );
                // Here increase the number.
                String key = Doubles.get(i);
                int count = Result.getOrDefault(key, 0); // ensure count will be one of 0,1,2,3,...
                Result.put(key, count + 1);
                System.out.println("63--it contains Key  : " + Doubles.get(i) );
            } else {

            System.out.println("59--Doubles[i]: " + Doubles.get(i));
            Result.put(Doubles.get(i) , 0);
            }
        }
//      Iterate over & figure which one is reaptead, update the count.  // Ffigure out which one have the maximum count.  use Hashmaps.
        System.out.println("61--Result : " + Result );

//        for ( int i =0; i< Doubles.size(); i++){
//            // if exists  increase the count by ++;
//            // if not exist move to next iteration.
//            if ( Result.containsKey(Doubles.get(i) ) ){
//                System.out.println("67--it contains Key  : " + Doubles.get(i) );
//            }
//
//        }




        System.out.println("HashMap: " + Result);
        System.out.println("HashMap: languages.get a  " + Result.get("Java"));

        System.out.println("containsKey: " + Result.containsKey ("Java"));
        System.out.println("containsValue : " + Result.containsValue(62));

        //

    }
}
