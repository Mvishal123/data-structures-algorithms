import java.util.Arrays;

public class Swapquestion {
    static void swap(int[] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Original: ");
        System.out.println(Arrays.toString(arr));
        swap(arr, 1,2);
        System.out.print("Swapped: ");
        System.out.println(Arrays.toString(arr));

    }
}
