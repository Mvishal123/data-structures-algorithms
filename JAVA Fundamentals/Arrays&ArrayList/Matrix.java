import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][4];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = in.nextInt();
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}

