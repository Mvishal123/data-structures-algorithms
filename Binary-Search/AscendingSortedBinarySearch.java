public class AscendingSortedBinarySearch {
    public static void main(String[] args) {
        int[] array = {-12, -7, -2, 0, 5, 6, 12, 14, 21, 32, 43, 54, 65};
        int target = 5;
        int ans = binarySearch(array, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (target < array[mid]){
                end = mid - 1;
            } else if (target > array[mid]){
                start = mid + 1;
            }else
                return mid;
        }
        return -1;
    }

}
