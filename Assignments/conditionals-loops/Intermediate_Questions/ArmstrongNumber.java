package Intermediate;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp = num;

        int sum = 0, power = 0;
        while(temp>0){
            temp /= 10;
            power++;
        }
        temp = num;
        while(temp > 0){
            int r = temp%10;
            temp /= 10;
            sum += Math.pow(r, power);
        }
        if(sum == num)
            System.out.println("It is an Armstrong number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
