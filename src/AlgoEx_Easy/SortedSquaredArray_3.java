package AlgoEx_Easy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Do not modify the input arry.
// Must create a new output array

//input:   1,2,3,5,6,8,9
//output: 1,4,6,25,36,64,81

//output array should be sorted.
public class SortedSquaredArray_3 {
    public static void main(String[] args) {
             var arr = Arrays.asList(1,2,3,5,6,8,9);
            sortSquareFn( arr );
    }

//    List<Integer>
    public static int sortSquareFn (List<Integer> input ){

//        var output2 = new Array() ; // Arrays.asList();
//        List<Integer> output=new ArrayList<Integer>();

        List<Integer> output = Arrays.asList(new Integer[input.size()]);
//        var output = Arrays.asList(new Integer[6]);

        System.out.println("input =" + input );

        for (int i = 0; i < input.size(); i++) {
            int value = input.get(i)*input.get(i);
            output.set(i, value);

            System.out.println("output =" + output );
        }
        return 0;
    }

}
