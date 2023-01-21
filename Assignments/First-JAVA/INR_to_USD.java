package Assignments;

import java.util.Scanner;

public class INR_to_USD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter currency in Rupees: ");
        double inr = input.nextDouble();

        double usd = inr* 0.012;
        System.out.println("The currency in USD is " + usd + "$");
    }
}
