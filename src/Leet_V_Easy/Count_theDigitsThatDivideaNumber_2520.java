//https://leetcode.com/problems/count-the-digits-that-divide-a-number/

//Input: num = 7
//        Output: 1
//        Explanation: 7 divides itself, hence the answer is 1.
//
//        Input: num = 121
//        Output: 2
//        Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
//
//        Input: num = 1248
//        Output: 4
//        Explanation: 1248 is divisible by all of its digits, hence the answer is 4.


// you'll have to really understnad the % and divisible concept.

package Leet_V_Easy;

public class Count_theDigitsThatDivideaNumber_2520 {

    public static void main(String[] args) {

        int num = 121;
        themethod();

        System.out.println(" 123%10 "+ 123%10);
        System.out.println(" 123%1000 ==>"+ 123%1000);

        System.out.println(" 123/10 "+ 123/10);
        System.out.println(" ((123/10)%10) ==>"+ ((123/10)%10)  );

        System.out.println(" 123/10 "+ 123/10);





        int n = 121;
        int a=n;

//            (a%(n%10)==0)

//        a%(n%10)==0
        System.out.println(" a%(n%10)  1=>  "+  121%10);
        System.out.println(" a%(n%10)  2=>  "+  121%1 );




//        int n = 1428 ;  //121=2   1428;  //1428 =  4

//        int a=n, c=0;
//        while(n>0)
//        {
//            if(a%(n%10)==0)
//                c++;
//            n/=10;
//        }
//        System.out.println("c ="+ c);

    }

    public static void themethod(){

//        seperate each digit.

        String name ="oooho";
        System.out.println("name= "+ name);

    }
}
