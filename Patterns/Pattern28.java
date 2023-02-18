public class Pattern28 {
    public static void main(String[] args) {
        int number = 10;
        pattern(number);
    }

    static void pattern(int num){
        for (int row = 1; row < 2*num; row++) {
            int colNumber = row > num ? 2*num - row : row;
            int spaces = row > num ? row - num : num - row;
            for (int space = 1; space <= spaces; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= colNumber; col++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }
}
