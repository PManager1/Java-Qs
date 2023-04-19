package Lessons;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    public static void main(String[] args) {

        int[] ints = {1, 2, 3};
        List<Integer> intList = new ArrayList<Integer>(ints.length);

        for (int i : ints)
        { intList.add(i); }

// new better  https://stackoverflow.com/questions/1073919/how-to-convert-int-into-listinteger-in-java

//        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        List lst = Arrays.asList(arr);
//        System.out.println(lst.size());

//        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<String> test = Arrays.asList("xyz", "abc");

//        Integer a[] = new Integer[] { 10, 20, 30, 40 };
//
//        // Getting the list view of Array
//        List<Integer> list = Arrays.asList(a);
//
//        // Printing all the elements inside list object
//        System.out.println("The list is: " + list);


//check if two arrays are equal

//        System.out.println("is arr1 equals to arr2 : " +
//                java.util.Arrays.equals(sorted_ar1, sorted_ar2));


    }
}
