public class Stringtype {
    public static void main(String[] args) {
        String name1 = "Vishal";
        String name2 = "Vishal";
        System.out.println(name1 == name2);
        // we get true
        // because the object is created in a string pool
        // if the value of the string is same, new object is not created
        // both the points to the same object in string pool inside Heap memory.

    }
}
