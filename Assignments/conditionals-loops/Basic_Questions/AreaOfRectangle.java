package Assignments.Basic;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("length: ");
        int len = in.nextInt();

        System.out.print("breadth: ");
        int breadth = in.nextInt();

        double area = len*breadth;
        System.out.println("Area: "+area);
    }
}
