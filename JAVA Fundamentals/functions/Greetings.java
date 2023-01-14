import java.util.Scanner;

public class Greetings {
    static void greet(){
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        String name = in.nextLine();

        System.out.println("Hello " + name + ". Have a great day! ");
    }

    public static void main(String[] args) {
        greet();
    }
}
