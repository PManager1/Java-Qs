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


//        String gfg[] = { "Geeks", "for", "Geeks" };
//        System.out.println("15--- gfg = "+ java.util.Arrays.toString(gfg));


//        Adding two arrays of string  -   https://www.tutorialspoint.com/javaexamples/arrays_merge.htm

//        String aa[] = { "A", "E", "I" };
//        String bb[] = { "O", "U" };
//        List list = new ArrayList(java.util.Arrays.asList(aa));
//        list.addAll(java.util.Arrays.asList(bb));
//        Object[] cc = list.toArray();
//        System.out.println(java.util.Arrays.toString(cc));   //



        // Add two STRING  arrays

        //        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c"));
//        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("c", "d", "e"));
//
//        listOne.addAll(listTwo);  //Merge both lists
//
//        System.out.println(listOne);
//        System.out.println(listTwo);


//        Add two INT  arrays
//        ArrayList<Integer> listOne = new ArrayList<>(java.util.Arrays.asList(1,2,3));
//        ArrayList<Integer> listTwo = new ArrayList<>(java.util.Arrays.asList(1,2,3));
//
//        listOne.addAll(listTwo);  //Merge both lists
//
//        System.out.println(listOne);
//        System.out.println(listTwo);


//        Add two int arrays with System.arraycopy  https://www.geeksforgeeks.org/java-program-to-merge-two-arrays/


        // first array
//        int[] a = { 10, 20, 30, 40 };
//
//        // second array
//        int[] b = { 50, 60, 70, 80 };
//
//        // determines length of firstArray
//        int a1 = a.length;
//
//        // determines length of secondArray
//        int b1 = b.length;
//
//        // resultant array size
//        int c1 = a1 + b1;
//
//        // create the resultant array
//        int[] c = new int[c1];
//
//        // using the pre-defined function arraycopy
//        System.arraycopy(a, 0, c, 0, a1);
//        System.arraycopy(b, 0, c, a1, b1);
//
//        // prints the resultant array
//        System.out.println(Arrays.toString(c));




    }
}
