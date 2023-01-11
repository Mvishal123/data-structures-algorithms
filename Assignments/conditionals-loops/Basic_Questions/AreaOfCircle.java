package Assignments.Basic;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the circle(in cm): ");
        float r = in.nextFloat();

        double area = 3.14 * Math.pow(r, 2);
        System.out.println("Area of the circle is " + area + "cm.sq");
    }
}
