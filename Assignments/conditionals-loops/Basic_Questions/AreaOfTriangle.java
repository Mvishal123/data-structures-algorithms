package Assignments.Basic;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Base of triangle(cm): ");
        int base = in.nextInt();
        System.out.print("Height of triangle(cm): ");
        int height = in.nextInt();

        double area = 0.5 * base * height;
        System.out.println("area: "+area+"cm.sq");
    }
}
