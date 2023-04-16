//https://leetcode.com/problems/shuffle-string/

//        Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//        Output: "leetcode"

//Input: s = "abc", indices = [0,1,2]
//        Output: "abc"
// I couldnt solve this because i was making it too complicatd  see below. commented

// try doing it with treemap -  https://leetcode.com/problems/shuffle-string/solutions/3030758/java-solution-using-treemap/
package Leet_V_Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Shuffle_String_1528 {
    public static void main(String[] args) {
       int indices [] = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
//        System.out.println("st[]  =  " + st);
//        indices = [4,5,6,7,0,2,1,3]
        char[] strArr= s.toCharArray();

        System.out.println("22--str ="+ strArr.toString());
        System.out.println("23--str ="+ Arrays.toString(strArr));

        for(int i=0;i<s.length();i++)
        {
            System.out.println("26 s.charAt(i) =" + s.charAt(i) );

            strArr[indices[i]]=s.charAt(i);

        }
         System.out.println(strArr);

//        return String.valueOf(str);
    }
    }


//    String st = "codeleet";
//    char[] stArr = st.toCharArray();
//
//        System.out.println("stArr 1 =  " + stArr   );
//                System.out.println("stArr  2=  " + Arrays.toString(stArr)   );
//                System.out.println("stArr  length=  " + stArr.length   );
//
//                for ( int i=0; i<stArr.length; i++){
////                    insert in the array
//        char tempChar =  (char) stArr[2];  //sb.charAt(i);
//        System.out.println("tempChar 1 =  " +  tempChar  );
////                  TempList.add(tempChar);
//        TempList.add('s');
//
//
//        System.out.println("TempList 2 =  " +     tempChar  );
//        }
//
