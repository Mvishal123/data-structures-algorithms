package Intermediate;

import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int sum=0,product=1,temp = num;
        while(temp > 0){
            int r = temp%10;
            temp = temp/10;
            sum = sum + r;
            product = product * r;
        }
        int ans = product-sum;
        System.out.println("Sum of digits: "+sum);
        System.out.println("product of digits: "+product);
        System.out.println("answer = " + ans);
    }
}
