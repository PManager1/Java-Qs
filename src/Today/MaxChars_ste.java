
//find the most frequently occurring character in a string with Java?
//Stephen grider
// use hashmap Map<Character, Integer> map = new HashMap<>();
//https://stackoverflow.com/questions/21750365/how-to-find-the-most-frequently-occurring-character-in-a-string-with-java

//maxChar("abcccccccd"); //c
// maxChar("apple 1231111"); //1

package Today;

import java.util.HashMap;

public class MaxChars_ste {
    static String test = "Hello! Are you all fine? What are u doing today? Hey Guyz,Listen! I have a plan for today.";

    public static void main(String[] args) {

        //maxChar("abcccccccd"); //c

        // put it in a map / object thing & give answer.  that stores the frequency of each item.

        // first sort the elements ?? we dont need it // try in JS

        HashMap<Character, Integer> characters = new HashMap<>();
        // add elements to hashmap
        characters.put('a', 8);
        characters.put('b', 2);
        characters.put('c', 6);
        characters.put('g', 9);

        System.out.println("HashMap: " + characters);
        System.out.println("HashMap: " + characters.get('a'));

        System.out.println("containsKey: " + characters.containsKey ('a'));
        System.out.println("containsValue : " + characters.containsValue(62));
        characters.put('g', 19);  // this will override the exiting value.
        characters.replace('z', 19);  //  if the key dont exist it wont do anything bc it dont exist.


    }

}
