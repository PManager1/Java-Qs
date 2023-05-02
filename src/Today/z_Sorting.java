package Today;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// jay redo it  // first time it was mostly copied.
public class z_Sorting {
    // JAy see Stephen video.
    public static void main(String[] args) {
//        BubbleSort();
//        selectionSort();   // we assume first index is the smallest. Its like proove me wrong sorting algo
            mergeSort();
    }


    public static void mergeSort(){
        System.out.println("Merge Sort called ");

    }


    public static void selectionSort() {
        // Here you keep on traversing until you find the index of the element that is lowest.
//        when you find it, you swap it to the beginning of the array.

        System.out.println("BubbleSort called ");
        int arr[] = { 10, 9, 8, 7, 6, 4 };


        for ( int i =0; i < arr.length; i ++ ){
            int MinIndex= i;

            for ( int j =i+1; j < arr.length; j ++ ) {
                if ( arr[j] < arr[MinIndex]  ){
                        MinIndex = j;
                     }
                }

                 if ( MinIndex != i ) {
                    int temp = arr[MinIndex];
                    arr[MinIndex] = arr[i];
                    arr[i] = temp;
                    System.out.println("37 swap ( 15 iter) called  on = j =" + "  " + Arrays.toString(arr));
                }

        }
                System.out.println("42 Final result ========="+  "  " + Arrays.toString(arr));
        }







    //    Bubble - purpose is to find the largest element and dag it to the right side.
    //    He explains why we need outer loop and inner loop.
    public static void BubbleSort() {
        System.out.println("BubbleSort called ");
        int arr[] =  {10,9, 8, 7, 6, 4 };


//        System.out.println("lst.get(2); " + arrlist.get(2));
        //    Check first two elements,  if left > right  swap it.


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println("37 swap called  arr2 = " + Arrays.toString(arr));
            }
        }
    }
}


