import java.util.Arrays;

public class Rough{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void bubble(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}




