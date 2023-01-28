import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {12,43},
                {23,12,5,32,65},
                {34,23,123,45,43}
        };
        int target = 12;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    // this finds the target in 2D array
    static int[] search(int[][] arr, int target){
        if (arr.length == 0)
            return new int[] {-1, -1};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target)
                    return new int[] {row, col};

            }
        }
        return new int[] {-1, -1};
    }
}
