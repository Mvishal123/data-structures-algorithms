public class ComparisonOfStrings {
    public static void main(String[] args) {
        // '==' method
        // it checks the value and if the ref. variables are pointing towards the same object.
        String name = "Vishal";
        String name1 = "Vishal";
        System.out.println(name == name1); //true


        // '.equals()' method
        // it does not check the pointers, it checks only the value;
        String n1 = new String("Vishal");
        String n2 = new String("Vishal");

        // now we have created 2 new objects so == shows false
        System.out.println(n1 == n2);// --> false

        //but .equals() shows true as the values are equal
        System.out.println(n1.equals(n2)); // --> True

    }
}
