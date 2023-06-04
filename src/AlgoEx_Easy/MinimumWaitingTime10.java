package AlgoEx_Easy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


//input = [3,2,1,   2,   6];  1,2,2,3,6
//         0,3,1+3, 5+2, 7+6


// 1,2,    2,    3,   6
// 0, 1, 2+1=3,  2+3=5, 3+5=8
//                  8+5+3+1

//output = 17

// Issue: if array is passed to the function  , its very difficutl to conver into the array like
// https://stackoverflow.com/questions/1073919/how-to-convert-int-into-listinteger-in-java
// here it says;  If you already have the array of ints, there is not quick way to convert, you're better off with the loop.


public class MinimumWaitingTime10 {

    public static void main(String[] args) {

    var hm = new HashMap<>();

        int iarr [] = {3,2,1,2,6};
//        List<Integer> ilst = Arrays.asList(iarr);

        String str[] = { "Homer", "Marge", "Bart", "Lisa", "Maggie" };
        List<String> lst = Arrays.asList(str);

//        List<Integer> arr = Arrays.asList(3,2,1,2,6);
        int arr1 [] = {3,2,1,2,6};
        List<Integer> arr = Arrays.asList(1,2,2,3,6);
//        Collections.sort(arr);
        System.out.println("18-arr =" + arr);

            int PrevNum = 0; int currentSum= 0 , totalSum= 0;

            for ( int i =0 ; i<= arr.size()-1; i++){
            if( i==0) { currentSum = 0;  } else {
                System.out.println(" i ="+ i);
                 currentSum = currentSum  + arr.get(i-1);
                totalSum = totalSum+currentSum;
                System.out.println("33 currentSum  ="+ currentSum);
                System.out.println("34 totalSum/ wt time ="+ totalSum);

             }
        }

    }



}
