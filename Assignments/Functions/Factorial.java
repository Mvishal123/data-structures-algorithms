package Assignments;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        int ans = 1;
        if(n == 0)
            return 1;
        else
            for(int temp = 1; temp<=n; temp++){
                ans *= temp;
        }
            return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-------FACTORIAL FINDER-------");
        System.out.println();
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.println("factorial: " + factorial(num));
    }
}
