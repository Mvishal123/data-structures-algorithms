import java.util.Arrays;

public class rough {
    public static void main(String[] args) {
        int[] array = {};
        sort(array);
        System.out.println(Arrays.toString(array));
    }


    static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            boolean sorted = false;
            for (int j = 0; j+1 < array.length - i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    sorted  = true;
                }
            }
            if(!sorted){
                break;
            }
        }
    }
}
