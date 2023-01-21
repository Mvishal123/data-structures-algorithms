package Intermediate;

import java.util.Scanner;

public class largestInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("You will get a input prompt until you enter '0'");
        int largest = 0;

        while(true){
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            if(num == 0)
                break;
            if(num > largest)
                largest = num;
        }
        System.out.println("Largest number is "+ largest);
    }
}
