package AlgoEx_Easy;


import java.util.*;

// input = { 141, 1, 17,-7, -17, -27, 18, 541, 8, 7 , 7  }
//output : sorted array of 3 largest nos;  [18, 141, 541]
public class FindThreeLargestNumbers_17 {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList( 141, 1, 17,-7, -17, -27, 18, 541, 8, 7 , 7);

        List<Integer> output = Arrays.asList( 0,0,0 );

        System.out.println(" input ="+ input + "out "+ output);


        for (int i = 0; i < input.size(); i++) {

            System.out.println( "20--->out "+ output);

            if ( input.get(i) > output.get(2)  ) { shiftAndUpdate( output, 1, 12);
                      }
            else if  ( input.get(i) > output.get(1)  ) {             }
            else if  ( input.get(i) > output.get(0)  ) {                 }

        }

    }

    public static void shiftAndUpdate( List arr[], int idx, int element ){

        for (int i = 0; i <idx; i++) {
                if (idx == i ) { // replace the number straight
//                        arr[i] = element;

                     }
                else {
                    arr[i] = arr [i+1];
                }

        }

        // if idx = 1 || 2   do the shifting  arr[i] = arr [i+1]

//            move value at idx to left
//            and put the value there at that index.
// if idx == 0, dont move, just put there.

//        for (int i = 0; i < ; i++) {
//
//        }

    }
}
