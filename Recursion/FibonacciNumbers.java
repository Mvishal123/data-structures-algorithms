public class FibonacciNumbers {
    public static void main(String[] args) {
        int number = 5;
        int ans = fibo(number);
        System.out.println(ans);
    }

    static int fibo(int num) {
        if (num < 2) {
            return num;
        }

        return fibo(num - 1) + fibo(num - 2);
    }
}
