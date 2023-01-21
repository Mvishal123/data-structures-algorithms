import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            num.add(in.nextInt());
        }
        System.out.println(num); // --> old
        System.out.println(num.set(2, 100)); // element at index 2 is replaced with 100
        System.out.println(num); // --> updated
        System.out.println(num.contains(12)); // --> false
    }
}
