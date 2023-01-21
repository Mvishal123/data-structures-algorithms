package Assignments;

import java.util.Scanner;

public class GradeChecker {
    static String grade_display(int mark){
        if(mark<=40 & mark>=0)
            return "Fail";
        else if(mark>40 & mark<=50)
            return "DD";
        else if(mark>50 & mark<=60)
            return "CD";
        else if(mark>60 & mark<=70)
            return "BC";
        else if(mark>70 & mark<=80)
            return "BB";
        else if(mark>80 & mark<=90)
            return "AB";
        else if(mark>90 & mark<=100)
            return "AA";
        else
            return "Invalid";
        }

        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            System.out.print("Enter your mark: ");
            int mark = in.nextInt();
            System.out.println("Grade: " + grade_display(mark));
        }
}
