import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aravindhravindran on 14/7/16.
 */
public class MinStepsInfinteGrid {
    public static void main(String[] args) {
        //(-1, -5), (-5, -5)
        List<Integer> integers =  Arrays.asList(4, 8, -7, -5, -13, 9, -7, 8);
        List<Integer> integers1 =  Arrays.asList(4, -15, -10, -3, -13, 12, 8, -8);

        //List<Integer> integers =  Arrays.asList( -7, -13 );
        //List<Integer> integers1 =  Arrays.asList(1, -5);

        System.out.println(coverPoints(integers, integers1));
    }

    public static int coverPoints(List<Integer> X, List<Integer> Y) {
        //System.out.println("size "+X.size());
        if(X.size() == 1){
            return 0;
        }else{
            Integer stepCount = 0;
            Integer sourceX = X.get(0);
            Integer sourceY = Y.get(0);
            for(Integer i = 1; i < X.size(); i++){

                Integer targetX = X.get(i);
                Integer targetY = Y.get(i);

                Integer diffX = targetX - sourceX;
                Integer diffY = targetY - sourceY;
                while(diffX != 0  || diffY != 0){
                    Integer count = 0;
                    //System.out.println("sourceX "+ sourceX+ " sourceY "+ sourceY+ " targetX "+targetX + " targetY "+targetY +" diffX "+diffX+" diffY "+diffY+" stepCount "+stepCount);
                    if(diffX > 0 && diffY == 0){
                        //X+1 , Y
                        count = diffX;
                        //System.out.println(" Inside X+1 , Y count "+count);
                        sourceX = sourceX + count;
                        stepCount = stepCount + count;

                    }else if(diffX == 0 && diffY > 0){
                        //X , Y+1
                        count = diffY;
                        //System.out.println(" Inside X , Y+1 count "+count);
                        sourceY = sourceY + count;

                        stepCount = stepCount + count;

                    }else if(diffX > 0 && diffY > 0){
                        //X+1 , Y+1
                        count = Math.abs(diffX) >= Math.abs(diffY)? Math.abs(diffY) : Math.abs(diffX);
                        //System.out.println(" Inside X+1 , Y+1 count "+count);
                        sourceX = sourceX +count;
                        sourceY = sourceY +count;

                        stepCount = stepCount + count;

                    }else if(diffX < 0 && diffY == 0){
                        //X-1 , Y
                        count = Math.abs(diffX);
                        //System.out.println(" Inside X-1 , Y count "+count);
                        sourceX = sourceX - count;
                        stepCount = stepCount + count;

                    }else if(diffX == 0 && diffY < 0){
                        //X , Y-1
                        count = Math.abs(diffY);
                        //System.out.println(" Inside X , Y-1 count "+count);
                        sourceY = sourceY - count;
                        stepCount = stepCount + count;

                    }else if(diffX < 0 && diffY < 0){
                        //X-1 , Y-1
                        count = Math.abs(diffX) >= Math.abs(diffY)? Math.abs(diffY) : Math.abs(diffX);
                        //System.out.println(" Inside X-1 , Y-1 count "+count);
                        sourceX = sourceX -count;
                        sourceY = sourceY -count;

                        stepCount = stepCount + count;

                    }else if(diffX < 0 && diffY > 0){
                        //X-1 , Y+1
                        count = Math.abs(diffX) >= Math.abs(diffY)? Math.abs(diffY) : Math.abs(diffX);
                        //System.out.println(" Inside X-1 , Y+1 count "+count);
                        sourceX = sourceX -count;
                        sourceY = sourceY +count;

                        stepCount = stepCount + count;

                    }else if(diffX > 0 && diffY < 0){
                        //X+1 , Y-1
                        count = Math.abs(diffX) >= Math.abs(diffY)? Math.abs(diffY) : Math.abs(diffX);
                        //System.out.println(" Inside X+1 , Y-1 count "+count);
                        sourceX = sourceX +count;
                        sourceY = sourceY -count;

                        stepCount = stepCount + count;

                    }
                    diffX = targetX - sourceX;
                    diffY = targetY - sourceY;
                }

            }
            return stepCount;
        }
    }
}
