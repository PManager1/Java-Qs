
// Suppose we have two lists of signed integers in ascending order: a and b.
// Write a function that takes these two ordered lists as well as an integer max_array_length
// argument and returns a merged list with max_array_length elements in ascending order.
//
//        Example:
//        a = [1, 3, 5]
//        b = [2, 6, 8, 9]
//
//        max_array_length = 3
//
//
//        => [1, 2, 3]


package Today;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class max_iiiish {
    public static void main(String[] args) {

//        int a []  = {1, 3, 5};
//        int b []  = {2, 6, 8, 9};


//        int[] array1 = {1, 2, 3};
//        int[] array2 = {4, 5, 6};
//
//        int aLen = array1.length;
//        int bLen = array2.length;
//        int[] result = new int[aLen + bLen];
//
//        System.arraycopy(array1, 0, result, 0, aLen);
//        System.arraycopy(array2, 0, result, aLen, bLen);
//        System.out.println(Arrays.toString(result));

//
//        String aa[] = { "A", "E", "I" };
//        String bb[] = { "O", "U" };
//        List list = new ArrayList(Arrays.asList(aa));
//        list.addAll(Arrays.asList(bb));
//        Object[] cc = list.toArray();
//        System.out.println(Arrays.toString(cc));

        Integer a []  = {1, 3, 5};
//        int c []  = {1, 3, 5};

        Integer b []  = {2, 6, 8, 9};

        //        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(1,2,3));
//        ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(a));
        ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(b));

        listOne.addAll(listTwo);  //Merge both lists
        System.out.println(listOne);

         Collections.sort(listOne);
            System.out.println("listOne =" + listOne);

            Integer[] out = new Integer[3];

            for(int i = 0; i < 3; i++) {
            out[i] = listOne.get(i);
        }

        System.out.println("72--out =" + Arrays.toString(out));

        funCalled(a,b);
    }


    public static void funCalled( Integer [] x, Integer [] y){

//        System.out.println("29- funCalled is called"+ x);
//         We add values of both array.


        int max_array_length = 3;


    }





}
