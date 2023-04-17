package Leet_V_Easy;


//Input: items =
//        [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
//        ruleKey = "color", ruleValue = "silver"
//               ruleKey  color is always: arr[1];
//               ruleValue color is always: arr[1];
//        Output: 1
//        Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].


//items =
//        [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]],
      //  ruleKey Type =>  arr[0];
    //  ruleValue phone =>  arr[0];


//Status ; Do it  //
// As per the solution on link below it has to be converted into the arraylist first. but i diont konw how.
// use this way to convert :  https://www.baeldung.com/java-multi-dimensional-arraylist



//https://leetcode.com/problems/count-items-matching-a-rule/solutions/1093390/java-easy-and-short-100-memory/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//        ruleKey = "type", ruleValue = "phone"
//        Output: 2
public class CountItemsMatchingaRule_1773 {

    public static void main(String[] args) {

        String ruleKey = "color", ruleValue = "silver";

        String [][] items =  { {"phone","blue","pixel"}, {"computer","silver","lenovo"}, {"phone","gold","iphone"}};

        String[] array = {"a", "b", "c", "d", "e"};
        //Method 1
//        List<String> list = Arrays.asList(array);
//        System.out.println(list);

//        List<List<String>> listOfLists = new ArrayList<List<String>>();
//
////        List<String> list = Arrays.asList(items);
//        System.out.println(multilist);

//        System.out.println(Arrays.toString(items[0].items[0]));


//        The main thing is the rule key  and check if it equals with the rule value;



    }
}







/*  not the best answer better is here  https://leetcode.com/problems/count-items-matching-a-rule/solutions/1093390/java-easy-and-short-100-memory/
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0 ;
        String type = "type" ;
        String color = "color" ;
        String name = "name" ;

        if(ruleKey.equals(type))
        {
            for(int i = 0 ; i < items.size() ; i++)
            {
                List<String> list = items.get(i) ;
                String val = list.get(0);
                if(  ruleValue.equals(val)  )
                    count++ ;
                continue ;
            }
        }
        else if(ruleKey.equals(color))
        {
            for(int i = 0 ; i < items.size() ; i++)
            {
                List<String> list = items.get(i) ;
                String val = list.get(1);
                if(  ruleValue.equals(val) )
                    count++ ;
                continue ;
            }
        }
        else if(ruleKey.equals(name))
        {
            for(int i = 0 ; i < items.size() ; i++)
            {
                List<String> list = items.get(i) ;
                String val = list.get(2);
                if( ruleValue.equals(val) )
                    count++ ;
                continue ;
            }
        }
        return count ;
    }


}

 */
