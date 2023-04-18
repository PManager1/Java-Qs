package Lessons;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    public static void main(String[] args) {

        int[] ints = {1, 2, 3};
        List<Integer> intList = new ArrayList<Integer>(ints.length);

        for (int i : ints)
        { intList.add(i); }



    }
}
