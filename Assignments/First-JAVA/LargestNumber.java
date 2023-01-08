package Assignments;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int n1 = input.nextInt();
        System.out.print("Enter number2: ");
        int n2 = input.nextInt();

        if(n1>n2){
            System.out.println("The largest number is "+n1);
        }
        else{
            System.out.println("The largest number is "+n2);
        }

    }
}
