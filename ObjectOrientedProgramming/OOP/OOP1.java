package OOP;

import java.util.Arrays;

public class OOP1 {
    static class Student{
        String name;
        int roll;
        float marks;

        // calling constructor from another constructor
        Student(){
            this(-1 , "Default: not updated", 100.0f);
        }
        Student(int roll, String name, float marks){
            this.roll = roll;
            this.name = name;
            this.marks = 89.3f;
        }
    }

    public static void main(String[] args){
        Student student1 = new Student(31, "Vishal Maheshwaran", 86.2f);
        Student newComer = new Student();

        System.out.println(student1.name);
        System.out.println(newComer.name);

    }
}
