package Vishal;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // runs until you press X or x
        int ans = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("n1: ");
            int n1 = in.nextInt();
            System.out.print("n2: ");
            int n2 = in.nextInt();
            System.out.println();

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println();

            System.out.print("Which operation do you want to perform: ");
            int op = in.nextInt();

            if (op == 1) {
                ans = n1 + n2;
            } else if (op == 2) {
                ans = n1 - n2;
            } else if (op == 3) {
                ans = n1 * n2;
            } else if (op == 4) {
                if (n2 != 0) {
                    ans = n1 / n2;
                } else {
                    System.out.println("Invalid");
                }
            } else if (op == 5) {
                ans = n1 % n2;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println("Answer: " + ans);
            System.out.println();
        }
    }
}
