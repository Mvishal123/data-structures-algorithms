package Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number: ");
        int num = in.nextInt();

        int i = 1, sum = 1;
        while(i <= num){
            sum *= i;
            i++;
        }
        System.out.println("Factorial: " + sum);
    }
}
