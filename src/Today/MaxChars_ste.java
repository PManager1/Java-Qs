
//find the most frequently occurring character in a string with Java?
//Stephen grider
// use hashmap Map<Character, Integer> map = new HashMap<>();
//https://stackoverflow.com/questions/21750365/how-to-find-the-most-frequently-occurring-character-in-a-string-with-java

//maxChar("abcccccccd"); //c
// maxChar("apple 1231111"); //1

package Today;

import java.util.HashMap;

public class MaxChars_ste {
    static String test = "Hello! Are you all fine? What are u doing today? Hey Guyz,Listen! I have a plan for today.";

    public static void main(String[] args) {

        //maxChar("abcccccccd"); //c

        // put it in a map / object thing & give answer.  that stores the frequency of each item.

        // first sort the elements ?? we dont need it // try in JS

        String st = "abcccccccd";

        String stArr [] = st.split("");
//
//        for ( int i =0; i< stArr.length; i++){
//            System.out.println(" stArr[i] = " + stArr[i] );
//        }

        HashMap<Character, Integer> chars = new HashMap<>();

// Insert elements in Hashmap.
        for ( int i =0; i< stArr.length; i++){
            System.out.println(" stArr[i] = " + stArr[i] );


            // if chars.IteratingChar = DOES NOT exists //  Create one, //  then append its count by 1.
            if ( chars.containsKey (stArr[i].charAt(0) ) == false ) {
                System.out.println("43----- DOES NOT exists ------ " +  stArr[i].charAt(0) );
            System.out.println("2 containsKey: " + chars.containsKey (stArr[i].charAt(0) ));

            chars.put(  stArr[i].charAt(0) , 1);

            System.out.println("3 containsKey: " + chars.containsKey (stArr[i].charAt(0) ));
            } else {
                // find the char and increase the number by one.
                System.out.println(" ELSE - EXIST - containsKey: " + chars.containsKey (stArr[i].charAt(0)  ));
                char key = stArr[i].charAt(0);
                System.out.println("51 key= "+ key);
                System.out.println("53 Value of a key= "+ chars.get('a'));
                int ValueOfKey = chars.get(stArr[i].charAt(0)); //  chars.get('a');
                System.out.println("55  ValueOfKey= "+ ValueOfKey);
                chars.replace(stArr[i].charAt(0), ValueOfKey +1 );
            }

            // if chars.IteratingChar = exists // Traverse the Object ,  If exists, then increase its Count Number.

        }

        System.out.println("chars: " + chars);

//        Jay finish it by sorting it.

// Solution: ( from stephen Video )  Traverse through each key , Then, find its value. Then keep updating the  max & maxChar values;

//        Now here finding which one have the highest number.
        int maxValue = 0;
           char maxChar;  // a, b, c

        for (Character key : chars.keySet()) {
            System.out.println("Key = " + key);
//            System.out.println("Key = " + value);
        }


//        for (Integer value : chars.values()) {
//            System.out.println("Value = " + value);
//        }


    }

}
