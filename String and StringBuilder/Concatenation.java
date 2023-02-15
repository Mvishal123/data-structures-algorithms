import java.util.ArrayList;
// concatenation(+) is only defined for primitives and if any of the value is a string

public class Concatenation {
    public static void main(String[] args) {
        // characters when added will give its ascii value
        System.out.println('a' + 'b');

        //When strings are added they are normally concatenated
        System.out.println("a" + "b");

        //Here integer is converted into Integer class which calls toString()
        //in simple terms integer gets converted into string type: "a" + "100"
        System.out.println("a" + 100);

        //same happens here, toString() is called
        // If there is any object concatenated with a string, toString() will be called. Simple!!
        System.out.println("Vishal" + new ArrayList<>());


    }
}
