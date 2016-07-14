import java.util.HashMap;
import java.util.Map;

/**
 * Created by aravindhravindran on 27/5/16.
 */
public class FirstMaximumRepeatingCharacter {
    public static class charOccurence{
        private int count;
        private int firstIndx;

        public charOccurence(int count, int firstIndx) {
            this.count = count;
            this.firstIndx = firstIndx;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }

        public int getFirstIndx() {
            return firstIndx;
        }
    }

    public static void main(String[] args) {
        /*Map<String, Object> map = new HashMap<>();
        map.containsKey(char)

        for(String key :map.keySet()){
            if(map.get(key).getCount() == 1){

            }
        }*/
    }
}
