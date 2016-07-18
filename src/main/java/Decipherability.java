import java.util.HashMap;
import java.util.Map;

/**
 *
 * Problem Statement
 You have a string s that contains at least K characters. Cat Snuke will remove exactly K characters from the string. Afterwards, Snuke will show you the new string and you have to guess the original indices of all removed characters. You win the game if you guess all of them correctly.

  0)"snuke"
 2
 Returns: "Certain"
 This is the example from the problem statement. As all characters are unique, you can always determine the indices of the erased ones.

 1)"aba"
 1
 Returns: "Certain"
 Snuke will show you one of the strings "ba", "aa", and "ab". In the first case you can be sure that he erased the character at index 0. The second and the third string correspond to indices 1 and 2, respectively.

 2)"aba"
 2
 Returns: "Uncertain"
 If Snuke shows you the string "a", there are two possibilities: either he erased the characters at indices 0 and 1, or the characters at indices 1 and 2.

 3)"abcdabcd"
 3
 Returns: "Certain"

 4)"koukyoukoukokukikou"
 2
 Returns: "Uncertain"

 5)"wolfsothe"
 8
 Returns: "Uncertain"

 6)"aa"
 2
 Returns: "Certain"

 https://community.topcoder.com/stat?c=problem_statement&pm=13656

 * Created by aravindhravindran on 19/7/16.
 */
public class Decipherability {
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
