package Assignments;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String str = input.nextLine();
        String r_str = "";

        for(int i = 0; i<str.length(); i++){
            r_str =   str.charAt(i) + r_str   ;
        }
        System.out.println("Reverse of the word is " + r_str);
        if(str.toLowerCase().equals(r_str.toLowerCase())){
            System.out.println("It is in Palindrome");
        }
        else{
            System.out.println("It is not in Palindrome");
        }

    }
}
