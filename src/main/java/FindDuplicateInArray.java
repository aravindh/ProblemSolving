import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *

 Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

 Sample Input:

 [3 4 1 4 1]

 Sample Output:

 1

 If there are multiple possible answers ( like in the sample case above ), output any one.

 * Created by aravindhravindran on 14/7/16.
 */
public class FindDuplicateInArray {
    public static void main(String[] args) {
        List<Integer> objects = Arrays.asList();
        repeatedNumber(objects);
    }
    public static int repeatedNumber(final List<Integer> a) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer num :a){
            //System.out.println("Checking for number "+num);
            if(map.containsKey(num)){
                //System.out.println("Duplicate number "+num);
                return num;
            }else{
                map.put(num, 1);
            }
        }
        return 0;
    }
}
