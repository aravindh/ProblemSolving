package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aravindhravindran on 30/8/16.
 */
public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("Search element in which target is first element, Expected 0 Actual "+binarySearch(1, Arrays.asList(1,2,3,4,5)));
        System.out.println("Search element in which target is last element, Expected 4 Actual "+binarySearch(5, Arrays.asList(1,2,3,4,5)));
        System.out.println("Search element in which target is first/last element with one element in dataset, Expected 0 Actual "+binarySearch(1, Arrays.asList(1)));
        System.out.println("Search element doesn't exists in dataset with one element in , Expected -1 Actual "+binarySearch(100, Arrays.asList(1)));
        System.out.println("Search element in empty dataset, Expected -1 Actual "+binarySearch(1, new ArrayList<Integer>(0)));
        System.out.println("Search element in which target is mid element(size odd), Expected 2 Actual "+binarySearch(3, Arrays.asList(1,2,3,4,5)));
        System.out.println("Search element in which target is mid element(size even), Expected 1 Actual "+binarySearch(2, Arrays.asList(1,2,3,4)));
        System.out.println("Search element in which is target doesn't exists greater than larger number, Expected -1 Actual "+binarySearch(420, Arrays.asList(1,2,3,4,5)));
        System.out.println("Search element in which is target doesn't exists lesser than smallest number, Expected -1 Actual "+binarySearch(1, Arrays.asList(10,20,30,40,50)));
    }

    /*
    Return index of the target element if exists or -1 if it does not exists
    */
    public static Integer binarySearch(Integer target, List<Integer> dataset){
        Integer targetElementIndex = -1;
        if(dataset.isEmpty()){
            return targetElementIndex;
        }
        //targetElementIndex = searchRecursive(target, dataset, 0, dataset.size()-1);
        targetElementIndex = searchIterative(target, dataset);
        return targetElementIndex;
    }

    /*
    * Recursion terminate condition: startIndex >= endIndex since we */

    private static Integer searchRecursive(Integer target, List<Integer> dataset, Integer startIndex, Integer endIndex){
            //terminate recursion
            if(startIndex > endIndex){
                return -1;
            }else{
                Integer midIndex = startIndex + ((endIndex-startIndex)/2);
                if(target.equals(dataset.get(startIndex))){
                    return startIndex;
                }else if(target.equals(dataset.get(endIndex))){
                    return endIndex;
                }else if(target.equals(dataset.get(midIndex))){
                    return midIndex;
                }else {
                    if (target < dataset.get(midIndex)) {
                        return searchRecursive(target, dataset, startIndex, midIndex - 1);
                    } else {
                        return searchRecursive(target, dataset, midIndex + 1, endIndex);
                    }
                }
            }

    }

    private static Integer searchIterative(Integer target, List<Integer> dataset){
        Integer startIndex = 0;
        Integer endIndex = dataset.size()-1;
        while(startIndex <= endIndex){
            Integer midIndex = startIndex + ((endIndex - startIndex)/2);
            if(target.equals(dataset.get(startIndex))){
                return startIndex;
            }else if(target.equals(dataset.get(endIndex))){
                return endIndex;
            }else if(target.equals(dataset.get(midIndex))){
                return midIndex;
            }else{
                if(target < dataset.get(midIndex)){
                    endIndex = midIndex - 1;
                }else{
                    startIndex = midIndex + 1;
                }
            }
        }

        return -1;
    }
}
