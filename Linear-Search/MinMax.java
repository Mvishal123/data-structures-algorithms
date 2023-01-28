public class MinMax {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 31, 6, 7, 8, 9, 0};
        int max = max(list);
        int min = min(list);
        System.out.println(max);
        System.out.println(min);
    }

    // this function returns the maximum number in an array
    static int max(int[] array){
        if(array.length == 0)
            return Integer.MAX_VALUE;
        int maxi = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxi)
                maxi = array[i];
        }
        return maxi;
    }

    // return min
    static int min(int[] array){
        if(array.length == 0)
            return Integer.MAX_VALUE;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}