import javax.sql.rowset.spi.SyncResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given the list of integers {3, 30, 34, 5,9}
 * o/p: is the largest number that can be made from the given list of numbers.
 * 9534330
 * Created by aravindhravindran on 14/1/16.
 */
public class LargestNumberFromListOfIntegers {
    private static String getLargestNumber(List<Integer> numbers){
        String largestnumber = "";

        return largestnumber;
    }
    public static void main(String[] args) {
/*
        List<Integer> integers = Arrays.asList(3, 30, 34, 5, 9);
        System.out.println("Largest Number: "+getLargestNumber(integers));
*/
        List<List<Integer>> A = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8), Arrays.asList(9, 10, 11, 12));
        ArrayList<ArrayList<Integer>> B = performOps(A);
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < B.get(i).size(); j++) {
                System.out.print(B.get(i).get(j) + " ");
            }
        }


    }

    static ArrayList<ArrayList<Integer>> performOps(List<List<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
    }
}
