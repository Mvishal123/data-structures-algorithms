package OOP;
class OuterClass{
    static String name;
    OuterClass(String name){
        OuterClass.name = name;
    }
}

public class StaticAndNonStatic {


    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass("Vishal");
        OuterClass obj2 = new OuterClass("Vaibhav");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
