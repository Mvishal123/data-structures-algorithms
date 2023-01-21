package Assignments;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Circumference {
    static double circumference(float r){
        double ans = 2*3.14*r;
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = in.nextFloat();
        System.out.println("The circumference is " + circumference(radius));
    }
}
