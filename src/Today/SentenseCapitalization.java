package Today;

//https://leetcode.com/problems/capitalize-the-title/

//soln - https://leetcode.com/problems/capitalize-the-title/solutions/1735927/Java-Solution/


//Input: title = "capiTalIze tHe titLe"
//        Output: "Capitalize The Title"
//        Explanation:
//        Since all the words have a length of at least 3, the first letter of each word is uppercase, and the remaining letters are lowercase.
//        Example 2:
//
//        Input: title = "First leTTeR of EACH Word"
//        Output: "First Letter of Each Word"
//        Explanation:
//        The word "of" has length 2, so it is all lowercase.
//        The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
//        Example 3:
//
//        Input: title = "i lOve leetcode"
//        Output: "i Love Leetcode"
//        Explanation:
//        The word "i" has length 1, so it is lowercase.
//        The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.

//jay check if following can be done in a better way ?
import java.util.Arrays;
import java.util.List;

public class SentenseCapitalization {

    public static void main(String[] args) {

        String title = "First leTTeR of EACH Word";
//        System.out.println("title charAt 0 =" + title.charAt(0) + "       "  + title.length());

        char cp =  Character.toLowerCase(title.charAt(0));
        String newTitle =  cp+title.substring(1,title.length() );

        String titleArr []  = title.split(" ");

        String joined3 = String.join(",", titleArr);
        System.out.println(joined3.replace(',', ' '));


        List<String> titleList = Arrays.asList(titleArr);
        String ResultString ="";
        for ( int i=0; i<titleList.size(); i++ ){
            String newWordString = titleArr[i];
            //   Output: "First Letter of Each Word"
                    String cap = newWordString.substring(0, 1).toUpperCase() + newWordString.substring(1).toLowerCase() ;
                    System.out.println("71--cap  =" + cap);
                    ResultString = ResultString + cap + " ";
                System.out.println("77---ResultString  =" + ResultString );

        }

    }


}


