import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {12,423},
                {23,12,5,32,65},
                {34,23,123,45,43}
        };
        int ans = search(arr);
        System.out.println(ans);
    }

    // this finds the target in 2D array
    static int search(int[][] arr){
        if (arr.length == 0)
            return Integer.MAX_VALUE;
        int max = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max)
                    max = anInt;
            }
        }
        return max;
    }
}
