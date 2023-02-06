public class DescendingSortedBinarySearch {
    public static void main(String[] args) {
        int[] array = {35, 23, 21, 12, 7, 5, 2, 1, 0, -12, -32, -123};
        int target = -32;
        int ans = binarysearch(array, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                start = mid + 1;
            } else if (target > array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}