import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5,4,2,1,3};
        bubblesort(array);
        System.out.println(Arrays.toString(array));

    }

    static void bubblesort(int[] array){
        // We are running the search n-1 times
        for (int i = 0; i < array.length; i++) {
            boolean sorted = false;
            //We are checking if n > n-1 and if no we swap the both elements
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    sorted = true;
                }
                if(!sorted){
                    break;
                }
            }
        }
    }
}
