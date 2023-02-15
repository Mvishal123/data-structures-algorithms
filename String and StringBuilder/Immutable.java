public class Immutable {
    public static void main(String[] args) {
        String name = "Vishal";
        name = "Vaibhav";
        System.out.println(name);

        // here first the name variable is initialised to Vishal, but then as Strings are immutable
        // the name variable is assigned to new object
        // the previous object "Vishal" is collected by the garbage collector
    }
}
