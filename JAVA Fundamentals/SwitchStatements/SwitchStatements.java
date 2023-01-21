package Vishal;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Name any fruit: ");
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of all fruits");
            case "Apple" -> System.out.println("Keeps doctor away");
            case "Banana" -> System.out.println("Long yellow slenderman");
            case "orange" -> System.out.println("Roundy round");
            default -> System.out.println("Try another fruit");
        }
    }
}
