import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aravindhravindran on 17/1/16.
 */
public class MaxNonNegativeSubArray {
    public static void main(String[] args) {
        //List<Integer> integers = Arrays.asList(1, 2, 3,-7, 20, -10);
        ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(0, 0, -1, 0 ));
        System.out.println(""+maxset(integers));

    }

    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
        int prevSumStartIdx = 0;
        int prevSumEndIdx = 0;
        int prevSum = 0;

        int currSumStartIdx ;
        int currSumEndIdx = 0;
        int currSum = 0;

        currSumStartIdx = -1;
        for(int i = 0; i <a.size(); i++){
            int num = a.get(i);

            if( num < 0){
                if(prevSum < currSum){
                    prevSum = currSum;
                    prevSumEndIdx = currSumEndIdx;
                    prevSumStartIdx = currSumStartIdx;
                }
                currSum = 0;
                currSumStartIdx = i;
            }else{
                currSumEndIdx = i;
                currSum = num + currSum;
            }
        }
        prevSumStartIdx++;
        currSumStartIdx++;
        currSumEndIdx++;
        prevSumEndIdx++;

        ArrayList<Integer> prevSubList = new ArrayList<Integer>(a.subList(prevSumStartIdx, prevSumEndIdx));
        ArrayList<Integer> integers = new ArrayList<Integer>(a.subList(currSumStartIdx, currSumEndIdx));
        if(prevSum < currSum){
            return prevSubList;
        }else {
            if( currSum > prevSum){
                return integers;
            }else{
                if(prevSubList.size() > integers.size()){
                    return prevSubList;
                }else if(prevSubList.size() < integers.size()){
                    return integers;
                }else{
                    if(prevSumStartIdx < currSumStartIdx){
                        return prevSubList;
                    }else{
                        return integers;
                    }
                }
            }
        }
    }
}
