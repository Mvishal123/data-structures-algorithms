package Assignments;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms you want in the Fibonacci Series: ");
        int n = input.nextInt();

        int first_term = 0, second_term = 1;
        for(int i = 1; i<=n; i++) {
            System.out.print(first_term + ", ");

            int next_term = first_term + second_term;
            first_term = second_term;
            second_term = next_term;

        }
    }
}

