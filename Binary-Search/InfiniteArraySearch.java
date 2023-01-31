public class InfiniteArraySearch {    public static void main(String[] args){
    int[] array = {1, 2, 3, 5, 6, 7, 9, 12, 13, 15, 16, 19, 21, 25, 27, 42, 75, 77, 83, 89, 91, 92, 95, 102};
    int target = 15;
    System.out.println(ans(array, target));
}

    static int ans(int[] array, int target){
        int start = 0;
        int end = 1;
        while(target > array[end]){
            int newStart = end + 1;
            end = end + ((end - start) + 1)*2;
            start = newStart;
        }
        return search(start, end, target, array);
    }

    static int search(int new_start, int new_end, int target, int[] array){
        int start = new_start;
        int  end = new_end;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < array[mid]){
                end = mid - 1;
            }else if(target > array[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
