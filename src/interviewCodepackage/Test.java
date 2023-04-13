import java.util.ArrayList;
import java.util.Arrays;


public class Test {
    public static void main(String[] args) {

        int[] tensArray = { 10,2,30,40,50,60};

        Arrays.sort(tensArray);

        System.out.println(" tensArray sorted    =" + Arrays.toString(tensArray)  );


//        int[] secondArray =  {40, 2,3,4,5,6,29};

        int[] secondArray = new int[10];
        Arrays.fill(secondArray, 5 );
        System.out.println(" 19 second Array     =" + Arrays.toString(secondArray)  );
    }
}
