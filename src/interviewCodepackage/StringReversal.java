// By stephoen Grider -
// write an algorithm to reverse a string in javascript without
// using the java provided function.

package interviewCodepackage;

public class StringReversal {

    public static void main(String[] args) {

        String str= "First", NewStr="";
        char Curr_ch;


        System.out.println("First"); //Example word

        for (int i=0; i<str.length(); i++)
        {

            Curr_ch= str.charAt(i); //extracts each character
            System.out.println(" Curr_ch = "+ Curr_ch );
            NewStr= Curr_ch+NewStr; //adds each character in front of the existing string

            System.out.println("NewStr = "+ i +"=" + NewStr );
        }
        System.out.println("Reversed word: "+ NewStr);
    }
    }

