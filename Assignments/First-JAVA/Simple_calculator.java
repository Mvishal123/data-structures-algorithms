package Assignments;

import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number1: ");
        int n1 = input.nextInt();
        System.out.print("number2: ");
        int n2 = input.nextInt();

        System.out.println("Which operation do u want to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int function = input.nextInt();
        if(function == 1){
            System.out.println("Answer: " + (n1 + n2));
        }
        else if(function == 2){
            System.out.println("Answer: " + (n1 - n2));
        }
        else if(function == 3) {
            System.out.println("Answer: " + (n1 * n2));
        }
        else if(function == 3) {
            System.out.println("Answer: " + (n1 / n2));
        }
    }


}
