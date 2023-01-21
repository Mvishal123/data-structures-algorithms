package Assignments;

import java.util.Scanner;

public class MinMax {
    static int min(int n1,int n2,int n3){
        int min =n1;
        if(n2<n1 & n3>n2)
            min = n2;
        else if(n2>n3 & n1>n3)
            min = n3;
        System.out.print("Minimum: ");
        return min;
    }


    static int max(int n1, int n2, int n3){
        int max = n1;
        if(n2>n1 && n2>n3)
            max = n2;
        else if(n3>n1 && n3>n2)
            max = n3;
        System.out.print("maximum: ");
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Num1: ");
        int n1 = in.nextInt();
        System.out.print("Num2: ");
        int n2 = in.nextInt();
        System.out.print("Num3: ");
        int n3 = in.nextInt();

        int minimum = min(n1,n2,n3);
        System.out.println(minimum);
        int maximum = max(n1, n2, n3);
        System.out.println(maximum);
    }
}
