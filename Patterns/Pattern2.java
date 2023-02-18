public class Pattern2 {
    public static void main(String[] args) {
        int num = 5;
        pattern(num);
    }

    static void pattern(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
