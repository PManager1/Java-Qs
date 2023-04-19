package stephen;

//https://www.geeksforgeeks.org/count-the-number-of-vowels-occurred-in-the-substrings-of-given-string/

//vowel chars = 'a', 'e', 'i', 'o', 'u';
//
//vowels('Hi There!');//3
//        vowels('Why do you ask'); //3
//        vowels('WHy');  //0

public class Count_the_number_of_vowels {

//     DO BY JS  IS EASIER
    public static void main(String[] args) {
        //vowels('Hi There!')

//    Pick one element and start matching it with the list of vowels.
        String st = "Hi There!";
        String[] CharArr = st.split("");
//    System.out.println(" stArr parts Asc   "  +  stArr ); stArr

        for (int i = 0; i < 6; i++) {
            System.out.println(" stArr parts Asc =  " + CharArr[i]);

//            if ("aeiouAEIOU".indexOf(CharArr) != -1);


//            char ch = CharArr[i];

//            System.out.println("ch " + ch );
//
//            if ( CharArr[i]  == 'a' || ch == 'e' || ch == 'i'
//                    || ch == 'o' || ch == 'u')
//        }

        }


// Arrays have method called Includes , use that  with the for loop.

    }
}
