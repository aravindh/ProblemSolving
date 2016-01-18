import java.util.Arrays;
import java.util.List;

/**
 * Created by aravindhravindran on 17/1/16.
 */
public class MaxSubsetInList {
    public static void main(String[] args) {
        //List<Integer> integers = Arrays.asList(1, 2, 3,-7, 20, -10);
        List<Integer> integers = Arrays.asList(1, 2, 19,-7, 20, -10);
        Integer prevSum = 0;
        Integer currSum = 0;
        for(Integer num : integers){
            currSum += num;
            if(prevSum > currSum){
                currSum = 0;
            }else{
                prevSum = currSum;
            }
        }
        if(prevSum > currSum){
            System.out.println("MaxSum "+prevSum);
        }else{
            System.out.println("MaxSum "+currSum);
        }
    }
}
