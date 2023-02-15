public class FormatSpecifier {
    public static void main(String[] args) {
        //to specify how many digits after decimal should be displayed
        // we need to add printf instead of println
        float number = 12.124732f;
        System.out.printf("%.3f\n", number);
        System.out.printf("PI: %.2f", Math.PI);
    }
}
