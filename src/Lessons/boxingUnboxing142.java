package Lessons;

import java.util.Arrays;

public class boxingUnboxing142 {
    public static void main(String[] args) {

       // Integer num = new Integer(45);  // Deprecated way.

        Integer boxInt = Integer.valueOf(15);
// Automatic
        Integer autoboxed = 15;

        System.out.println("boxInt = " +  boxInt);

        System.out.println("autoboxed = " +  autoboxed.getClass().getName());




        Double ddd = Double.valueOf(15.30);
        System.out.println("16- - ddd = " +  ddd);

        Integer[]  Intarray = new Integer[5];
        Intarray[0] = 50;
        System.out.println("16- - Intarray = " + Arrays.toString(Intarray) );

        Character[]  chararray =  {'a', 'b', 'c'};
        System.out.println("25- - chararray = " + Arrays.toString(chararray) );
    }
}
