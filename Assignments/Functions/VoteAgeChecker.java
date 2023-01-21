package Assignments;

import java.util.Scanner;

public class VoteAgeChecker {
    static String age_checker(int age){
        if(age<=0)
            return "Not born yet";
        else if(age>=18)
            return "Eligible to vote";
        else
            return "Not eligible to vote";
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter your age: ");
        int age = in.nextInt();

        System.out.println(age_checker(age));
    }
}
