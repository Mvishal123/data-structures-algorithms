public class LinearSearchCode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 3;
        int ans = display(arr, target);
        int index = search(arr, target);
        boolean find = find(arr, target);
        System.out.println(find);
    }

    // Returns the index of the element
    static int search(int[] arr, int target){
        if (arr.length == 0)
            return -1;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target)
                return index;
        }
        return -1;
    }

    // Returns true if element is present
    static boolean find(int[] arr, int target){
        if(arr.length == 0)
            return false;
        for(int elements : arr){
            if (elements == target)
                return true;
        }
        return false;
    }

    //returns the element if it is present in the array
    static int display(int[] arr, int target){
        if (arr.length == 0)
            return Integer.MAX_VALUE;
        for (int elements : arr){
            if (elements == target)
                return elements;
        }
        return Integer.MAX_VALUE;
    }
}
