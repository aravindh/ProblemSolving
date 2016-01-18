/**
 * Created by aravindhravindran on 17/1/16.
 */
public class TrailingZerosInFactorial {
    public static Long getFactorial(Integer num){
        Long result = 1l;
        while(num > 0){
            result = result * num;
            num  = num -1;
        }
        return result;
    }
    public static Integer getNumberOfTrailingZero(){
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Factorial "+getFactorial(10));
    }
}
