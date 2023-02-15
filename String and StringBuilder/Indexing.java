public class Indexing {
    public static void main(String[] args) {
        // we cant get the index of String by name[i] method
        // Yes. We know that strings are array of characters but we can't use normal indexing
        // instead we use name.charAt(i) method
        // it internally uses the normal indexing method only

        String name = "Vishal";
        System.out.println(name.charAt(2));
    }
}
