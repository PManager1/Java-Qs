package interviewCodepackage.java;//Prime_Number_Check


public class Prime_Number_Check {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("0 is a " + (isPrime(0) + " prime number"));
        System.out.println("1 is a " + (isPrime(1) + " prime number"));
        System.out.println("2 is a " + (isPrime(2) + " prime number"));
        System.out.println("3 is a " + (isPrime(3) + " prime number"));
        System.out.println("4 is a " + (isPrime(4) + " prime number"));
        System.out.println("8 is a " + (isPrime(8) + " prime number"));
        System.out.println("17 is a " + (isPrime(17) + " prime number"));
    }


    //  Static Methods
    public static boolean isPrime(int wholeNum) {
        System.out.println ("  ==> Testing for whole Num ="+ wholeNum );

        if ( wholeNum <= 2) {
            return (wholeNum  == 2);
        }

        for (int divisor = 2; divisor <= wholeNum; divisor++) {
            // If divisible by Zero so not a Prime no.
            if (wholeNum % divisor == 0) {
//                System.out.println (wholeNum +" is divisible - so Not a prime  ");
                return false;
            }

        }
        return true;
    }


}






