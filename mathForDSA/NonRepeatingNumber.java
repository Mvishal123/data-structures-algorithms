public class NonRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        nonRepeat(arr);
    }

    static void nonRepeat(int[] arr){
        int ans = 0;
        for(int n : arr){
            ans = ans^n;
        }
        System.out.println("The non repeating number is : " + ans);
    }
}
