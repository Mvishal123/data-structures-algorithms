public class Pattern4 {
    public static void main(String[] args) {
        int number = 5;
        pattern(5);
    }

    static void pattern(int num){
        for (int row = 1; row <= num ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
