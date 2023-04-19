//chunk  ([1, 2, 3, 4, 5, 6], 2)
////Output will be [[1, 2], [3, 4], [5, 6]]

//        chunk([1, 2, 3, 4, 5], 3)
////Output will be [[1, 2, 3], [4, 5]]

//// chunk([1, 2, 3, 4, 5], 2)
////Output will be [[ 1, 2], [3, 4], [5]]
//stephen says its harder
// 4/18/23  1220 PM
package stephen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayChunking {
    public static void main(String[] args) {
        int chunkSize = 2;

        int arr  []  = {1, 2, 3, 4, 5, 6};

        List<Integer> intList = new ArrayList<Integer>(arr.length);
// Jay fix it, There shoudl be a better way to create / fill the array.
        for (int i : arr)   { intList.add(i); }

        System.out.println("30--intList =" +  intList);
            //chunk  ([1, 2, 3, 4, 5, 6], 2)
        ////Output will be [[1, 2], [3, 4], [5, 6]]    int chunkSize = 2;

            int Pointer = 0;    //i<intList.size();
            for ( int i=Pointer; i<Pointer+2; i++){
                System.out.println("31--i =" +  intList.get(i) );
                Pointer++;
            }



//            here insert into the ChunkedArray


    }
//    Using the while loop.  Do the loop for n elemnts and then Move it into  a seperate array.  // keep the counter

//    do the loop


}
