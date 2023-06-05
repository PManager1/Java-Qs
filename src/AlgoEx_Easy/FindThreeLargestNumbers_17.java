package AlgoEx_Easy;


import java.util.*;

// input = { 141, 1, 17,-7, -17, -27, 18, 541, 8, 7 , 7  }
//output : sorted array of 3 largest nos;  [18, 141, 541]
public class FindThreeLargestNumbers_17 {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList( 141, 1, 17,-7, -17, -27, 18, 541, 8, 7 , 7);

        List<Integer> threeLargest = Arrays.asList( 0,0,0 );

        System.out.println(" input ="+ input + "threeLargest "+ threeLargest);

        for (int i = 0; i < input.size(); i++) {
            int num = input.get(i);
            if ( num > threeLargest.get(2)  ) { shiftAndUpdate( threeLargest, num,2 );  }
            else if  ( num > threeLargest.get(1)  ) { shiftAndUpdate( threeLargest,  num, 1);       }
            else if  ( num > threeLargest.get(0)  ) { shiftAndUpdate( threeLargest, num, 0);      }
        }
    }

    public static void shiftAndUpdate(List<Integer> arr, int num , int idx  ){
        System.out.println("28-- arr"+  arr );

        for (int i = 0; i <= idx; i++) {
                if (i == idx ) { // replace the number straight
                        arr.set(idx, num);
                     }
                else {
                    int j = arr.get(i+1);   //                    arr [i] = arr [i+1];
                    arr.set(i, j );
                }
            System.out.println("42- arr"+  arr );
        }

    }
}
