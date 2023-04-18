//chunk  ([1, 2, 3, 4, 5, 6], 2)
////Output will be [[1, 2], [3, 4], [5, 6]]

//        chunk([1, 2, 3, 4, 5], 3)
////Output will be [[1, 2, 3], [4, 5]]

//// chunk([1, 2, 3, 4, 5], 2)
////Output will be [[ 1, 2], [3, 4], [5]]
//stephen says its harder

package stephen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayChunking {
    public static void main(String[] args) {
        int chunkSize = 2;

        int arr  []  = {1, 2, 3, 4, 5, 6};

//        int[] ints = {1, 2, 3, 4, 5, 6};
        List<Integer> intList = new ArrayList<Integer>(arr.length);
//        List<Integer> intList = new ArrayList<Integer>(arr.length);

        for (int i : arr)
        { intList.add(i); }

        System.out.println("30--intList =" +  intList);
//        System.out.println("Orilist =" +  OriginalList);



//        var oList = Arrays.asList(arr);
//        System.out.println("oList =" + Arrays.toString(oList) );


    }
//    Using the while loop.  Do the loop for n elemnts and then Move it into  a seperate array.  // keep the counter

//    do the loop


}
