/**
 * Given a String, you need to print longest possible substring that has exactly M unique characters.
 * If there are more than one sub string of longest possible length, then print any one of them
 * Eg:
 * "aabbcc" k=1
 * Max SubString {"aa", "bb", "cc"}
 *
 * "aabbcc", k=2
 * Max SubString {"aabb", "bbcc"}
 *
 * "aabbcc", k=3
 * Max SubString "aabbcc" among {"aabbcc", "abbcc", "aabbc", "abbc"}
 *
 * "aaabbb", k=3
 * No Unique subStrings
 *
 * Created by aravindhravindran on 14/7/16.
 */
public class LongestSubStringWithKUniqueCharacters {
    public static void main(String[] args) {
        String subString = null;
        subString = longestSubStringWithKUniqueCharacters("aabbcc", 1);
        //subString = longestSubStringWithKUniqueCharacters("aabbcc", 2);
        //subString = longestSubStringWithKUniqueCharacters("aabbcc", 3);
        //subString = longestSubStringWithKUniqueCharacters("aaabbb", 3);
        System.out.println("Longest SubString "+subString );

    }

    private static String longestSubStringWithKUniqueCharacters(String input, int numberOfuniqueCharacters){

        return null;
    }
}
