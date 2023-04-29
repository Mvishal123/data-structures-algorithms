package ImportingClass.ClassFile;

public class Class1 {
        public String name;
        public int age;
        public String gender;
        public static int classStrength;

        public Class1(String name, int age, String gender){
            this.name = name;
            this.age = age;
            this.gender = gender;
            Class1.classStrength += 1;
        };
}
