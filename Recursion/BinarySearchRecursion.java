public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int target = 12;
        int start = 0;
        int end = array.length -1;
        System.out.println(bs(array, target, start, end));
    }



    static int bs(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }
        return bs(arr, target, start, end);
    }
}
