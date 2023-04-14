

//https://leetcode.com/problems/convert-the-temperature/

//Kelvin = Celsius + 273.15
//        Fahrenheit = Celsius * 1.80 + 32.00
// 4/13/23  // done but seen a little how to make array .
//Input: celsius = 36.50
//        Output: [309.65000,97.70000]
//        Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.
//
package Leet_V_Easy;

import java.util.Arrays;

public class Convert_the_Temperature {
    public static void main(String[] args) {


        double Celsius = 36.50;

            double Kelvin =  Celsius + 273.15;
            double Fahren = Celsius * 1.80 + 32.00;

            double [] result = {Kelvin, Fahren};

        System.out.println(" result"+  Arrays.toString(result) );
    }

}
