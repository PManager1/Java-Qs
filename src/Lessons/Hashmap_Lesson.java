package Lessons;

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
        System.out.println("HashMap: " + languages.get('a'));

        System.out.println("containsKey: " + languages.containsKey ("Java"));
        System.out.println("containsValue : " + languages.containsValue(62));

    }
}
