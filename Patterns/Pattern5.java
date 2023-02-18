 public class Pattern5 {
    public static void main(String[] args) {
        int number = 5;
        pattern(number);
    }

    static void pattern(int num){
        for (int row = 1; row < 2*num; row++) {
            int colNumber = row > num ? 2*num - row : row;
            for (int col = 0; col < colNumber; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
