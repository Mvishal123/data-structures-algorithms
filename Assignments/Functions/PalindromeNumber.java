package Assignments;

import java.util.Scanner;

public class PalindromeNumber {
    static String palindrome_checker(int n){
        int temp = n;
        int rev = 0;
        while(temp != 0){
            int remainder = temp%10;
            temp = temp/10;
            rev = (rev*10)+remainder;
        }
        if(rev == n)
            return "Palindrome";
        else
            return "Not a Palindrome";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = in.nextInt();
        System.out.println(palindrome_checker(num));
    }
}
