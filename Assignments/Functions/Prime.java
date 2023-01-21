package Assignments;

import java.util.Scanner;

public class Prime {
    static String prime(int n) {
        int c = 2;
        if (n <= 1)
            return "Neither prime nor composite";
        else {
            while (c*c < n) {
                if (n % c == 0) {
                    return "Not prime";
                } else
                    c++;
            }
            return "Prime";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.println(num + " is " + prime(num));
    }
}
