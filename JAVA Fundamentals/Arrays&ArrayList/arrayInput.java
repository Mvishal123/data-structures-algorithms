import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] marks = new int[5];

        for(int i = 0; i < marks.length; i++){
            marks[i] = in.nextInt();
        }
        System.out.println(marks[4]);
    }
}
