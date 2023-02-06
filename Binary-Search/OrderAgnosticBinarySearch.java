public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 12, 21, 23, 24, 55, 345, 463, 465, 2344};
        int target = 12;
        int ans = binarySearch(array, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        boolean isAsc = array[0] < array[array.length - 1];
        while(start <= end){
            int mid = start + (end - start)/2;

            if (array[mid] == target){
                return mid;
            }

            else if (isAsc) {
                if (target > array[mid]){
                    start = mid + 1;
                }else
                    end = mid - 1;
            }

            else
                if(target < array[mid]){
                    start = mid + 1;
                }
        }
        return -1;
    }
}