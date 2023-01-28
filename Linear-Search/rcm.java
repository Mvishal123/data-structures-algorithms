public class rcm {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        int richest = 0;
        int sum = 0;
        for (int[] account : accounts) {
            for (int i : account) {
                sum += i;
            }
            if (sum > richest) {
                richest = sum;
            }
            sum = 0;
        }
        System.out.println(richest);
    }
}
