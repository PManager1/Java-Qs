package interviewCodepackage.java;// FIZZ Buzz,
///Write a program that prints the numbers from 1 to 100 and
// for multiples of ‘3’ print “Fizz” instead of the number
// and for the multiples of ‘5’ print “Buzz”.
// This is not a easy question.   ( Its tricky question )

public class Fizzbuzz {

    public static void main(String[] args) {
        System.out.println("Start");

        for( int i =0; i<=100; i++ ){

            if(i <= 3) {continue; }
            if(( i % 3 == 0) && ( i % 5 == 0))  {

                System.out.println(" Fizz Buzz ");
                continue;
            }
            if( i % 3 == 0){
                System.out.println("Fizz");
                continue;
            }
            if( i % 5 == 0){
                System.out.println("Buzz ");
                continue;
            } else{
                System.out.println(i);
            }

        }


    }
}
