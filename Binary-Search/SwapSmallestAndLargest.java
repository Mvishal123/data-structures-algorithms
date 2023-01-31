import java.util.Arrays;

public class SwapSmallestAndLargest {
    public static void main(String[] args) {
        int[] array = {12, 14, 15, 100, 12, 14, 16, 17, 1};
        int[] ans = swap(array);
        System.out.println(Arrays.toString(ans));
    }

    static int[] swap(int[] arr) {
        int smallest = 0;
        int largest = arr.length - 1;
        for (int elements = 0; elements < arr.length; elements++) {
            if (arr[elements] < arr[smallest]) {
                smallest = elements;
            }
            if (arr[elements] > arr[largest]) {
                largest = elements;
            }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[largest];
        arr[largest] = temp;
        return arr;
    }
}

