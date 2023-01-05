package vishal;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("num1: ");
        int n1 = input.nextInt();
        System.out.print("num2: ");
        int n2 = input.nextInt();
        int sum = n1 + n2;
        System.out.println("SUM = " + sum);

    }
}
