import java.util.Arrays;

public class PassinginFunctions {
    static void change(int[] arr) {
        arr[0] = 100;
    }


    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(list));
        change(list);
        System.out.println(Arrays.toString(list));
    }
}

