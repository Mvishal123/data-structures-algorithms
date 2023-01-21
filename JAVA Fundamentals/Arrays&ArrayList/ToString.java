import java.util.Arrays;
import java.util.Scanner;

public class ToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] marks = new int[5];
        System.out.print("Enter elements in array: ");
       for(int i = 1; i < marks.length; i++){
           marks[i] = in.nextInt();
       }
        System.out.println(Arrays.toString(marks));
    }
}
