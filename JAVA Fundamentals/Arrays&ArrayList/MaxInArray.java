public class MaxInArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 100, 3, 123, 5};
        System.out.print("maximum: ");
        System.out.println(max(num));
    }

    static int max(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
