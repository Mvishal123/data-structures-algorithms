package Questions;

public class FloorofaNumber {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 13, 15, 17, 21, 23, 25, 54, 64, 75, 93};
        int target = 2;
        int ans = ceil(arr, target);
        System.out.println(ans);
    }

    static boolean isAsc(int[] arr) {
        if (arr[0] < arr[arr.length - 1])
            return true;
        else
            return false;
    }

    static int ceil(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if (target < arr[0]){
            return -1;
        }
        else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return arr[mid];
                } else if (isAsc(arr)) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else
                        start = mid + 1;
                } else {
                    if (target < arr[mid]) {
                        start = mid + 1;
                    } else
                        end = mid - 1;
                }
            }
            return arr[end];
        }
    }
}
