import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {213, 235,21, 53, 24, 46};
        int max = 0;
        int pos = array.length-1;
        int checker = 0;
        while(pos>0) {
            for (int i = 1; i < array.length - checker; i++) {
                if (array[i] > array[max]) {
                    max = i;
                }
            }
            swap(array, max, pos);
            max = 0;
            pos--;
            checker++;
        }
        System.out.println(Arrays.toString(array));
    }


    static void swap(int[] array, int max, int position){
        int temp = array[position];
        array[position] = array[max];
        array[max] = temp;
    }
}
