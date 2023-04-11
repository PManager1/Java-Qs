//in teh range 1 to 1000.
// find all the numbers that can be divided by 3 & 5.
// Print those numbers.
// Do all the code within the void main fn , do not create seperate fun.

public class NumsDivByThreeAndFive {
    public static void main(String[] args) {
        int countOfMatches = 0;  // save using what Array ?
        int sumOfMatches = 0;

        for ( int i =1; i <= 1000; i++ ) {

            if (   (i % 3 == 0) && (i % 5 == 0)  ){
            System.out.println( "Yes  divisible by both three and five");
            countOfMatches++;
            sumOfMatches = sumOfMatches+i;

            if(countOfMatches == 5){
                for ( int j=0; j<=4; j++){
                    System.out.println(" the sum =" + sumOfMatches );
                }
                break;
            }
        }

    }
    }

}
