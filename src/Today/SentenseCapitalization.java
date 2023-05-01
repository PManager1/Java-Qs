package Today;

//https://leetcode.com/problems/capitalize-the-title/

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

public class SentenseCapitalization {

    public static void main(String[] args) {
        //        Input: title = "First leTTeR of EACH Word"
//        Output: "First Letter of Each Word"

//     Algorithm:  string.split(" ").  saves each word in an array.
//        Traverse each word in the array and capitalize the first and lowercase other characters.
        String title = "First leTTeR of EACH Word";
        System.out.println("title charAt 0 =" + title.charAt(0)  + title.length());

        char cp =  Character.toLowerCase(title.charAt(0));
        System.out.println("37----> cp =" + cp );
        String newTitle =  cp+title.substring(1,title.length() );
        System.out.println(" 39 - - newTitle =" + newTitle );

        String titleArr []  = title.split(" ");

        for ( int i=0; i<titleArr.length; i++ ){
            System.out.println("titlearr0 " + titleArr[i] );



        }


    }


}


