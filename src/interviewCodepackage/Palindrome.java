// Palindrom check
//https://www.programiz.com/java-programming/examples/palindrome-number
//Easy by Jay

package interviewCodepackage;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Radar", reverseStr = "";
        str = str.toLowerCase();
        int len = str.length();

        System.out.println("17-str = "+ str);



        for ( int i=0; i< str.length(); i++ ){

            reverseStr = str.charAt(i)+ reverseStr;
            System.out.println(" i ="+  reverseStr );
        }

        System.out.println(" str ="+  str );
        System.out.println(" reverseStr ="+  reverseStr );

        if ( str.equals(reverseStr)){
            System.out.println(" Yes reversed is same");
        } else System.out.println(" Reversed is Not  same");



    }
}
