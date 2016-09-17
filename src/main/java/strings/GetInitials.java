package strings;

/**
 * When dealing with long names and phrases, we sometimes use the initial letters of words to form its acronym. For example, we use "JFK" instead of "John Fitzgerald Kennedy", "lgtm" instead of "looks good to me", and so on.

 You are given a name. This contains a phrase: one or more words separated by single spaces. Please compute and return the acronym of this phrase. (As above, the acronym should consist of the first letter of each word, in order.)

 Constraints
 - name will contain between 1 and 50 characters, inclusive.
 - Each character in s will be a space or a lowercase English letter ('a' - 'z').
 - The first and last character in s will not be a space.
 - No two continuous spaces can appear in s.

 * Created by aravindhravindran on 17/9/16.
 */
public class GetInitials {
    public static void main(String[] args) {
        System.out.println(getInitials("A R RAhman"));
        System.out.println(getInitials("ARRAhman"));
        System.out.println(getInitials("A R R A h m a n"));
        System.out.println(getInitials("john fitzgerald kennedy"));
        System.out.println(getInitials("n"));
    }
    public static String getInitials(String name){
        String seperator = " ";
        String[] words = name.split(seperator);
        char[] result = new char[words.length];
        int idx = 0;
        for(String word: words){
            result[idx] = word.charAt(0);
            idx++;
        }
        return new String(result);
    }
}
