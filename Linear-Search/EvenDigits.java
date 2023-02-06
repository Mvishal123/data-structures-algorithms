public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 00};
        int ans = find(nums);
        System.out.println(ans);
    }

    // returns the number of elements with even digits
    static int find(int[] arr){
        int temp = 0;
        int count = 0;
        for(int i : arr){
            int num = i;
            while(num != 0){
                num /= 10;
                temp++;
            }
            if(temp%2 == 0){
                count++;
            }
            temp = 0;
        }
        return count;
    }
}