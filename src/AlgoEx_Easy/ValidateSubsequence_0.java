package AlgoEx_Easy;

//https://www.algoexpert.io/questions/validate-subsequence

// Given two non-empty arrays of integers,
// write a function that determines whether the second array
// is a subsequence of the first one.

// array =  = [5, 1, 22, 25, 6, -1, 8, 10];
//sequence =  = [1, 6, -1, 10];

public class ValidateSubsequence_0 {
    public static void main(String[] args) {

        List<Integer> array = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        boolean res = usingFirstFn(List<Integer> array, List<Integer> sequence);
        System.out.println("res =" + res);
        boolean res2 = usingPointerFn();
        System.out.println("res2 =" + res2);
    }

    public static boolean usingFirstFn(List<Integer> array, List<Integer> sequence){

        
        return false;
    }
    public static boolean usingPointerFn(){
        return false;
    }
}


