package Intermediate;

import java.util.Scanner;

//Take integer inputs till the user enters 0
// and print the sum of all numbers
public class SumOfAllNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("You get prompt until you enter '0'");
        System.out.println();

        int sum = 0;
        while(true){
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            if(num == 0)
                break;
            else
            sum += num;

        }
        System.out.println("Sum of all the entered number is " + sum);
    }
}
