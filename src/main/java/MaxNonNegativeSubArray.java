import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aravindhravindran on 17/1/16.
 */
public class MaxNonNegativeSubArray {
    public static void main(String[] args) {
        //ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(1, 2, 3,-7, 20, -10)); //[20]
        //ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(0, 0, -1, 0 )); //return [0,0]
        //ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(-1, -1, -1, -1, -1)); //[]
        //ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1)); //[1,1,1,1,1]
        //ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(1967513926, 1540383426, -1303455736, -521595368)); //[1967513926 1540383426 ]
        //ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(0,0)); //[]
        ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(-52263)); //[]
        System.out.println(""+maxset(integers));

    }

    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
        int prevSumStartIdx = -1;
        int prevSumEndIdx = -1;
        long prevSum = 0;

        int currSumStartIdx ;
        int currSumEndIdx = 0;
        long currSum = 0;

        currSumStartIdx = -1;
        for(int i = 0; i <a.size(); i++){
            int num = a.get(i);

            if( num < 0){
                if(prevSum <= currSum){
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

        currSumStartIdx++;
        currSumEndIdx++;


        ArrayList<Integer> prevSubList = null;
        if(prevSumStartIdx> prevSumEndIdx)
            prevSubList = new ArrayList<Integer>();
        else{
            prevSumStartIdx++;prevSumEndIdx++;
            prevSubList = new ArrayList<Integer>(a.subList(prevSumStartIdx, prevSumEndIdx));
        }

        ArrayList<Integer> integers = null;
        if(currSumStartIdx > currSumEndIdx)
            integers = new ArrayList<Integer>();
        else{
            integers = new ArrayList<Integer>(a.subList(currSumStartIdx, currSumEndIdx));
        }
        System.out.println(currSumStartIdx);
        System.out.println(prevSumStartIdx);
        if(prevSum < currSum){
            return integers;
        }else {
            if( prevSum > currSum){
                return prevSubList;
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
