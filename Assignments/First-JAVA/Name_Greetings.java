package Assignments;

import java.util.Scanner;

public class Name_Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hi " + name + ". Have a great day!");
    }
}
