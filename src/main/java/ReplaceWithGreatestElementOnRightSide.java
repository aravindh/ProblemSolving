import java.util.Arrays;
import java.util.List;

/**
 * Given a list of numbers,replace every number with the greatest number from the right side.
 * If no greater element found set as -1.
 * eg:
 * i/p: 16, 17, 4, 3, 5, 2
 * o/p: 17, -1, 5, 5, -1, -1
 *
 * Created by aravindhravindran on 19/1/16.
 */
public class ReplaceWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        //List<Integer> integers = Arrays.asList(16, 17, 4, 3, 5, 2);
        List<Integer> integers = Arrays.asList(5,4,3,2,1);
        int size = integers.size();
        int max = integers.get(size-1);
        for (int i = size-1; i > -1; i--){
            if(max <= integers.get(i)){
                max = integers.get(i);
                integers.set(i, -1);
            }else{
                integers.set(i, max);
            }
        }
        System.out.println(integers);
    }
}
