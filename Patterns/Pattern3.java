public class Pattern3 {
    public static void main(String[] args) {
        int number = 5;
        pattern(number);
    }

    static void pattern(int num){
        for (int row = 0; row < num; row++) {
            for (int col = 1; col <= num - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
