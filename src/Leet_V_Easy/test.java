package Leet_V_Easy;

import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {

//        String st = "codeleet";
//        System.out.println("st[]  =  " + st);
//        indices = [4,5,6,7,0,2,1,3]

//        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list = Arrays.asList(4,5,6,7,0,2,1,3);
//        arr[indices[i]]=s.charAt(i);
        List<Character> TempList = Arrays.asList();
        List<Integer> FinalList = Arrays.asList();

//         take the elemeent at that location and

        //put the string inside the list array.
//            StringBuffer sb = new StringBuffer(st);
//            System.out.println("st[]  =  " +  sb.charAt(4)  );
//            System.out.println("st[]  sb.length =  " + sb.length()  );

        String st = "codeleet";
        char[] stArr = st.toCharArray();

        System.out.println("stArr 1 =  " + stArr   );
        System.out.println("stArr  2=  " + Arrays.toString(stArr)   );
        System.out.println("stArr  length=  " + stArr.length   );

        for ( int i=0; i<stArr.length; i++){
//                    insert in the array
            char tempChar =  (char) stArr[2];  //sb.charAt(i);
            System.out.println("tempChar 1 =  " +  tempChar  );
//                  TempList.add(tempChar);
            TempList.add('s');


            System.out.println("TempList 2 =  " +     tempChar  );
        }



//         insert it in the new location in FinalList.



    }
}
