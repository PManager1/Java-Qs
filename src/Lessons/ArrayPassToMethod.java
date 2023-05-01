package Lessons;


import java.util.Arrays;

public class ArrayPassToMethod {

    public static void main(String[] args) {

        String gfg[] = { "Geeks", "for", "Geeks" };
        System.out.println("11--- gfg = "+Arrays.toString(gfg));
        receive_Array(gfg, gfg);

        String[] str_Array = return_Array();
        System.out.println("14-Array returned from method:" + Arrays.toString(str_Array));


    }

    public static String[] return_Array() {
        //define string array
        String[] ret_Array = {"Java", "C++", "Python", "Ruby", "C"};
        //return string array

        System.out.println("24-- ret_Array equals " +  ret_Array );


        return ret_Array;
    }

    public static String[] receive_Array(  String[] x, String[] y  ) {
        //define string array
//        String[] ret_Array = {"Java", "C++", "Python", "Ruby", "C"};
        //return string array
        System.out.println("35--The first element is: " + x[0]);
        System.out.println("35--The first element is: " + Arrays.toString(x));

            return null;
    }

}




