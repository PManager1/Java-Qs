package stephen;

//https://leetcode.com/problems/valid-anagram/
//        Input: s = "anagram", t = "nagaram"
//        Output: true
//
//        Input: s = "rat", t = "car"
//        Output: false
//
//        Given two strings s and t, return true if t is an anagram of s,
//        and false otherwise.
//
//        An Anagram is a word or phrase formed by rearranging the
//        letters of a different word or phrase, typically using all the original letters exactly once.
// 4/18  552


//    split each word into its characters.
//    sort it in one order
//    one order shoudl be equal to other order.

    String st1 = "anagram";
    String st2 = "nagaram";

    System.out.println(" split " + st1.split(""));

    String[] parts = st2.split("");
    // String part1 = parts[0]; // 004
    // String part2 = parts[1]; // 034556
    //
    // System.out.println(" part1 " + part1 );
    // System.out.println(" part2 " + part2 );
    //
    // for (int i = 0; i < parts.length; i++){
    // System.out.println(" all parts  " + parts[i] );

}

var find  = st1.contains('a');

System.out.println(" find  " + find );



//        String string = "004-034556";
//        String[] parts = string.split("-");
//        String part1 = parts[0]; // 004
//        String part2 = parts[1]; // 034556
//        System.out.println(" part1 " + part1 );
//        System.out.println(" part2 " + part2 );

}

}
