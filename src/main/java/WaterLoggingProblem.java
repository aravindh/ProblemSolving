import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aravindhravindran on 3/1/16.
 * i/p: 1,5,3,7,2
 * o/p
 * i/p: 4,5,2,1,2,3
 * o/p: 4
 *
 * 4,5,2 - 0
 * 5,2,1 - 0
 * 2,1,2 - 1
 * 1,2,3 - 0
 *
 * i/p: 5,3,7,2,6,4,5,9,1,2
 * o/p:
 *
 * 5,3,7 - 2
 * 3,7,2 - 0    4
 * 7,2,6 - 4    5
 * 2,6,4 - 0    4
 * 6,4,5 - 1
 * 4,5,9 - 0
 * 5,9,1 - 0
 * 9,1,2 - 1
 *
 */
public class WaterLoggingProblem {
    /*public static void main(String[] args) {
        System.out.println("Hello");
        List<Integer> integers = Arrays.asList(4, 5, 2, 1, 2, 3);
        Integer a,b, c;
        for(int i =0; i< integers.size(); i++){
            a= integers.get(i);
            b= integers.get(i+1);
            c= integers.get(i+2);

        }
    }*/

    public static String check(String s, int K){
        Map<Character,Integer> charsMap= new HashMap<Character, Integer>();
        for(Character c:s.toCharArray()){
            charsMap.put(c, null);
        }
        if(K < charsMap.size())
            return "CERTAIN";
        else
            return "UNCERTAIN";

    }
    public static void main(String args[]){
        System.out.println("Input string aba and k 1 is expected result CERTAIN actual result "+check("aba", 1));
        System.out.println("Input string snuke and k is 2 expected result CERTAIN actual result "+check("snuke", 2));
        System.out.println("Input string aba and k is 2 expected result UNCERTAIN actual result "+check("aba", 2));
        System.out.println("Input string abcdabcd and k is 3 expected result CERTAIN actual result "+check("abcdabcd", 3) );
        System.out.println("Input string koukyoukoukokukikou and k is 2 expected result UNCERTAIN actual result "+check("koukyoukoukokukikou", 2));
        System.out.println("Input string wolfsothe and k is 8 expected result UNCERTAIN actual result "+check("wolfsothe", 8));
        System.out.println("Input string aa and k is 2 expected result CERTAIN actual result "+check("aa", 2));

    }
}
