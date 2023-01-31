public class ROUGH {
    int[] ans = {-1, -1};
    ans[0] = search(nums, target, true);
    ans[1] = search(nums, target, false);
        return ans;
}

    int search(int[] array, int target, boolean firstindex){
        int ans = -1;
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == array[mid]){
                ans = mid;
                if(firstindex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else if(target < array[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
