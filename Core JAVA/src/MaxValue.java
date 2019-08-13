import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
 * Created by manishasingh on 7/26/2017.
 */
public class MaxValue implements Callable<Integer> {

    int[] arr;

    int maxValue;

    public MaxValue(int[] arr) {
        this.arr = arr;
    }

    @Override
    public Integer call() {
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > maxValue)
                maxValue = arr[idx];
        }

        return maxValue;
    }


    public static void main(String[] args) throws  Exception{

        int r = 0;

        MaxValue[] maxValues = new MaxValue[4];
        for (int idx = 0; idx < 4; idx++) {
            maxValues[idx] = new MaxValue(new int[]{5,1,8,2});
          Integer f =   maxValues[idx].call();

            r += f;
        }

        System.out.println(r);
    }
}
