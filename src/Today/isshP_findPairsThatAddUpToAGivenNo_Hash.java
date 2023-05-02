package Today;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

//https://www.geeksforgeeks.org/given-two-unsorted-arrays-find-pairs-whose-sum-x/
public class isshP_findPairsThatAddUpToAGivenNo_Hash {

    public static void main(String[] args) {

        int arr1[] = { 1, 0, -4, 7, 6, 4 };
        int arr2[] = { 0, 2, 4, -3, 2, 1 };
        int targetSum = 8;
        findPairs(arr1, arr2, arr1.length, arr2.length, targetSum);
    }

    public static void findPairs(int arr1[], int arr2[], int n, int m, int targetSumm)
    {   // Insert all elements of first array in a hash
        HashMap<Integer, Integer> TheMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++)
            TheMap.put(arr1[i], 0);
            System.out.println("27 --- TheMap ="+ TheMap );

        // Subtract sum from second array elements one
        // by one and check it's present in array first
        // or not
        for (int j = 0; j < m; j++)  //8   - arr2[j]
            if (TheMap.containsKey(targetSumm - arr2[j]))
                System.out.println(targetSumm - arr2[j] + " " + arr2[j]);
    }
}


//        6 2
//        4 4
//        6 2
//        7 1

// good solution :  https://www.techiedelight.com/find-pair-with-given-sum-array/
