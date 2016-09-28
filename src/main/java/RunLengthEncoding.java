import java.util.ArrayList;
import java.util.List;

/**
 * Given an input string, write a function that returns the Run Length Encoded string for the input string.

 For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.

 Constraints:
 1. No extra space
 * Created by aravindhravindran on 8/9/16.
 */
public class RunLengthEncoding {
    public static void main(String[] args) {
        String input = null;
        input = "wwwwaaad";
        System.out.println("RunLengthEncoding for string "+input+" Expected w4a3d1 Actual "+encode(input));
        input = "wwwwaaadexxxxxx";
        System.out.println("RunLengthEncoding for string "+input+" Expected w4a3d1e1x6 Actual "+encode(input));
        input = "wwwwwwwwwwwwaaadexxxxxx";
        System.out.println("RunLengthEncoding for string "+input+" Expected w12a3d1e1x6 Actual "+encode(input));
        input = "abababababab";
        System.out.println("RunLengthEncoding for string "+input+" Expected a1b1a1b1a1b1a1b1a1b1a1b1 Actual "+encode(input));
        input = "ab";
        System.out.println("RunLengthEncoding for string "+input+" Expected a1b1 Actual "+encode(input));
        input = "";
        System.out.println("RunLengthEncoding for string "+input+" Expected empty Actual "+encode(input));
        input = null;
        System.out.println("RunLengthEncoding for string "+input+" Expected null Actual "+encode(input));

    }

    private static String encode(String encodeInput){

        if(encodeInput == null || encodeInput.isEmpty()) {
            return null;
        }
        String result = "";
        Character prevChar = encodeInput.charAt(0);
        Integer charCount = 1;
        for(int i =1; i< encodeInput.length(); i++){
            Character currentChar = encodeInput.charAt(i);
            if(prevChar.equals(currentChar)){
                charCount ++;
            }else{
                result = result+ prevChar;
                result = result+ charCount;
                charCount = 1;
            }
            prevChar = currentChar;
        }
        result = result+ prevChar;
        result = result+ charCount;
        return result;
    }


    private static void decode(String decodeInput){

    }
}
