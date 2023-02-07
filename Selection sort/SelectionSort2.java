import java.util.Arrays;

public class rough {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 3, 5};
        slectionsort(array);
        System.out.println(Arrays.toString(array));
    }

    static void slectionsort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int last = array.length - i - 1;
            int max = getMaxElement(array, last);
            swap(array, max, last);
        }
    }

    static int getMaxElement(int[] array, int last) {
        int max = 0;
        for (int i = 1; i <=last; i++) {
            if(array[i] > array[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] array, int max, int last){
        int temp = array[last];
        array[last] = array[max];
        array[max] = temp;
    }
}
