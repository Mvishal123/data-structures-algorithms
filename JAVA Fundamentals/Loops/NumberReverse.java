package Vishal;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp = num;
        int reversed = 0;

        while(temp > 0){
            int remainder = temp%10;
            temp = temp/10;
            reversed = (reversed*10)+remainder;
        }
        System.out.println(reversed);
    }
}
