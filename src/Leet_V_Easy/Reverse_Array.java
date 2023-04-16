//Tim B video 127
//3/14/23
//212 - 219  PM //

package Leet_V_Easy;

import java.util.Arrays;

public class Reverse_Array {

    public static void main(String[] args) {

    int [] num = {1,2,3,4,5 };

    // do it in half for loop/ using swaping
        int mid = num.length/2;
        System.out.println("mid =" + mid);
        System.out.println("num.length =" + num.length);

    for ( int i=0; i<num.length/2; i++ ){

        //First iteration swap first with the Last.
                var temp = num[i];
                    num[i] = num[num.length-1-i];
                    num[num.length-1-i] = temp;

        System.out.println("i =" + i);
        System.out.println("num tostring =" + Arrays.toString(num));

    }

    }
}
