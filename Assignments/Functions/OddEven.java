package Assignments;

import java.util.Scanner;

public class OddEven {
    static void oddeven(int n){
        if(n%2 == 0)
            System.out.println(n + " is an even number");
        else
            System.out.println(n + " is an odd number");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        oddeven(n);
    }
}
