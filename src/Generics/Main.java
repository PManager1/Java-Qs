package Generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Printer <Integer> p1 = new Printer <> (25);
            p1.print();

        Printer <Double> p2 = new Printer<>(25.89);
        p2.print();


//        ArrayList<Cat> cats = new ArrayList<>;

    }
}
