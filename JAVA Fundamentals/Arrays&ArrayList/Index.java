import java.util.Arrays;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = in.nextInt();
            }
        }
        for (int a[] : arr)
            System.out.println(Arrays.toString(a));
    }
}
