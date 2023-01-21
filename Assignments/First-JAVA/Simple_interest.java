package Assignments;
import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = input.nextInt();
        System.out.print("Time: ");
        float time = input.nextFloat();
        System.out.print("Rate: ");
        float rate = input.nextFloat();

        float simple_interest = principal + (principal*time*(rate/100));
        System.out.println("Total value = " + simple_interest);
    }
}
