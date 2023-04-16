//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
//
//        Input: operations = ["--X","X++","X++"]
//        Output: 1
//        Explanation: The operations are performed as follows:
//        Initially, X = 0.
//        --X: X is decremented by 1, X =  0 - 1 = -1.
//        X++: X is incremented by 1, X = -1 + 1 =  0.
//        X++: X is incremented by 1, X =  0 + 1 =  1.
// 3/13/  after seeing how its done.
// soln https://leetcode.com/problems/final-value-of-variable-after-performing-operations/solutions/3389217/powerful-logic-in-java/

package Leet_V_Easy;

public class Variable_After_Performing_Operations {

    public static void main(String[] args) {

//        String [] operations = {"--X","X++","X++"};
        String [] operations = {"++X","++X","X++"};
            int TheX = 0;

        for ( int i = 0; i< operations.length; i++){

            System.out.println(" TheX =" + TheX );
            char operand = operations[i].charAt(1);
            System.out.println("operations = " + operations[i].charAt(1));

            if ( operations[i].charAt(1) == '+'){
                TheX += 1;
            } else {
                TheX -= 1;
            }


            System.out.println("============= Result of TheX=" + TheX );
        }

    }
    }
