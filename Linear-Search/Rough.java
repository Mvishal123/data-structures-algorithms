public class Rough {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {1,4,4,3}, {3,5,7,4}};
        System.out.println("The richest customer");
        System.out.println(richest(arr));

    }

    static int richest(int[][] arr){
        int sum = 0;
        int richest = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];

            if(sum>richest)
                richest = row;
            }
            sum = 0;
        }
        return richest;
    }
}
