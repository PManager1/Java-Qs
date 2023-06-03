package Lessons_Arrays_And_Hashmaps;

import java.util.HashMap;

public class Hashmap_Lesson {

    public static void main(String[] args) {


        HashMap<String, Integer> languages = new HashMap<>();

        // add elements to hashmap
        languages.put("Java", 8);
        languages.put("JavaScript", 1);
        languages.put("Python", 3);
        System.out.println("HashMap: " + languages);

        System.out.println("HashMap: " + languages);
        System.out.println("HashMap: languages.get a  " + languages.get("Java"));

        System.out.println("containsKey: " + languages.containsKey ("Java"));
        System.out.println("containsValue : " + languages.containsValue(62));
//        (languages);
//        putIfAbsent('steve', 89);
//        map.put(key, count + 1);




//        HashMap<Character, Integer> characters = new HashMap<>();
//        // add elements to hashmap
//        characters.put('a', 8);
//        characters.put('b', 2);
//        characters.put('c', 6);
//        characters.put('g', 9);
//
//        System.out.println("HashMap: " + characters);
//        System.out.println("HashMap: " + characters.get('a'));
//
//        System.out.println("containsKey: " + characters.containsKey ('a'));
//        System.out.println("containsValue : " + characters.containsValue(62));
//        characters.put('g', 19);  // this will override the exiting value.
//        characters.replace('z', 19);  //  if the key dont exist it wont do anything bc it dont exist.


//         increment a  value in Hashmap  :   https://stackoverflow.com/questions/81346/most-efficient-way-to-increment-a-map-value-in-java
//        String key = Doubles.get(i);
//        int count = Result.getOrDefault(key, 0); // ensure count will be one of 0,1,2,3,...
//        Result.put(key, count + 1);
    }
}
