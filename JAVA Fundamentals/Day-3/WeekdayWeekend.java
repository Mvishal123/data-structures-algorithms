package Vishal;

import java.util.Scanner;

public class WeekdayWeekend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any number to check if it's a weekday/weekend: ");
        int day = in.nextInt();
        switch(day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6 ,7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid. Input should be from 1 to 7 only");
        }
    }
}