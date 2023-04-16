package Leet_V_Easy;

//You are given an array of strings sentences, where each sentences[i] represents
// a single sentence.
//        Return the maximum number of words that appear in a single sentence.

//Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
//        Output: 6

import java.util.Arrays;

//4/14
// Redo  i couldnt solve it.
public class Maximum_Number_of_Words_in_Sentences {
    public static void main(String[] args) {

       String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};


        System.out.println("max ="+sentences[0] );

        String [] split = sentences[0].split(" ");

        System.out.println("split len ="+ Arrays.toString(split).length() );

//        System.out.println("split len ="+ Arrays.toString(split).[0] );

//        int max=0;
//        for(int i=0; i<sentences.length; i++) {
//            max = Math.max(max,(sentences[i].split(" ")).length);
//
//        }
//        return max;
//        System.out.println("max"+max);

    }
}
