public class DynamicArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 4, 6, 12},
                {7, 8}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
