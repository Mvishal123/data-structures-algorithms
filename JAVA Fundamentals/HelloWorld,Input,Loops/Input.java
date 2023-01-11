package vishal;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hi "+ name+ ". Have a great day!");
    }
}
