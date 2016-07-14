import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by aravindhravindran on 28/5/16.
 */
public class RotateMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();

        input.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        input.add(new ArrayList<Integer>(Arrays.asList(3,4)));

        //input.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        //input.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
        //input.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
        System.out.println("input "+input);
        rotate(input);
        System.out.println(input);
    }
    public static void rotate(ArrayList<ArrayList<Integer>> a) {
        ArrayList<ArrayList<Integer>> target = new ArrayList<ArrayList<Integer>>(a.size());
        int row = a.size();
        //int x,y;
        for(int j = 0, x=0 ; j < row; j++, x++ ){
            System.out.println("For j="+j +"x="+x);
            ArrayList<Integer> integers = new ArrayList<Integer>(row);
            for(int i=row-1, y=0 ; i >=0 ; i--, y++){
                System.out.println("For i="+i+"y="+y);
                System.out.println("element "+a.get(i).get(j));
                integers.add(a.get(i).get(j));
            }
            target.add(integers);

        }
        System.out.println("target "+target);
        for(int i = 0 ;i < a.size();i++){
            for(int j =0 ; j<a.size();j++){
                a.get(i).set(j, target.get(i).get(j));
            }
        }
        System.out.println("a"+a);
    }
}
