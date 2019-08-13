package Techgig;

import java.util.Arrays;

/**
 * Created by manishasingh on 8/11/2017.
 */
public class Pipes {

    private static  int[] calculateMinimumPipeCost(int[] input1) {
        int[] minPipesCostArr = new int[input1.length - 1];
        Arrays.sort(input1);

        int sum = input1[0];
        for (int idx = 0; idx < minPipesCostArr.length; idx++) {
            minPipesCostArr[idx] =  sum  += input1[idx + 1];
        }

        return minPipesCostArr;
    }

    public static void main(String[] args) {
        int[] remainingPipesArr = new int[]{ 2, 3, 4, 6};
        calculateMinimumPipeCost(remainingPipesArr);
    }
}
