import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aravindhravindran on 17/1/16.
 */
public class MaxNonNegativeSubArray {
    public static void main(String[] args) {
        System.out.println("input 1, 2, 3,-7, 20, -10 expected [20] actual "+maxset(new ArrayList<Integer>(Arrays.asList(1, 2, 3,-7, 20, -10)))); //[20]
        System.out.println("input 0, 0, -1, 0  expected [0,0] actual "+maxset(new ArrayList<Integer>(Arrays.asList(0, 0, -1, 0 )))); //return [0,0]
        System.out.println("input -1, -1, -1, -1, -1 expected [] actual "+maxset(new ArrayList<Integer>(Arrays.asList(-1, -1, -1, -1, -1)))); //[]
        System.out.println("input 1,1,1,1,1 expected [1,1,1,1,1] actual "+maxset(new ArrayList<Integer>(Arrays.asList(1,1,1,1,1)))); //[1,1,1,1,1]
        System.out.println("input 1967513926, 1540383426, -1303455736, -521595368 expected [1967513926 1540383426 ] actual "+maxset(new ArrayList<Integer>(Arrays.asList(1967513926, 1540383426, -1303455736, -521595368)))); //[1967513926 1540383426 ]
        System.out.println("input 0,0 expected [0,0] actual "+maxset(new ArrayList<Integer>(Arrays.asList(0,0)))); //[0,0]
        System.out.println("input -52263 expected [] actual "+maxset(new ArrayList<Integer>(Arrays.asList(-52263)))); //[]

    }

    private static Boolean isCurrentGreatest(Integer currStartIdx, Integer currEndIdx, Double currSum,
                                      Integer prevStartIdx, Integer prevEndIdx, Double prevSum){
        if(prevStartIdx == null || prevEndIdx == null){
            return true;
        }
        if(currSum > prevSum){
            return true;
        }else {
            if(currSum == prevSum){
                Integer prevLength = prevEndIdx - prevStartIdx;
                Integer currLength = currEndIdx - currStartIdx;
                if(currLength > prevLength){
                    return true;
                }else if(currLength < prevLength){
                    return false;
                }else{
                    if(prevStartIdx < currStartIdx){
                        return false;
                    }else{
                        return true;
                    }
                }
            }else{
                return false;
            }
        }

    }
    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
        Integer prev = null;

        Integer currStartIdx = null;
        Integer currEndIdx = null;
        Double currSum  = 0d;

        Integer prevStartIdx = null;
        Integer prevEndIdx = null;
        Double prevSum  = 0d;

        for(Integer idx = 0 ; idx < a.size(); idx++){
            Integer curr = a.get(idx);

            if(curr >= 0){
                if(currStartIdx == null){
                    currStartIdx = idx;
                }
                currEndIdx = idx;
                currSum = currSum +curr;
            }else{
                if(prev != null ) {
                    if (prev >= 0 && curr < 0) {
                        if (isCurrentGreatest(currStartIdx, currEndIdx, currSum,
                                prevStartIdx, prevEndIdx, prevSum)) {
                            prevStartIdx = currStartIdx;
                            prevEndIdx = currEndIdx;
                            prevSum = currSum;
                        }
                        currStartIdx = null;
                        currEndIdx = null;
                        currSum = 0d;
                    }
                }
            }
            prev = curr;
        }

        if((currStartIdx == null || currEndIdx == null) && (prevStartIdx == null || prevEndIdx == null)){
            return new ArrayList<Integer>(0);
        }else{
            if(isCurrentGreatest(currStartIdx, currEndIdx, currSum,
                    prevStartIdx, prevEndIdx, prevSum)){
                return new ArrayList<Integer>(a.subList(currStartIdx, ++currEndIdx));

            }else{
                return new ArrayList<Integer>(a.subList(prevStartIdx, ++prevEndIdx));
            }

        }
    }
}
