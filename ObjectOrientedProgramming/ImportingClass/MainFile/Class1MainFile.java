package ImportingClass.MainFile;

import ImportingClass.ClassFile.Class1;

public class Class1MainFile {
    public static void main(String[] args) {

        Class1 s1 = new Class1("Vishal", 18, "male");
        Class1 s2 = new Class1("Vaibhav", 13, "male");
        Class1 s3 = new Class1("Mahesh", 41, "male");

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(Class1.classStrength);
    }
}
