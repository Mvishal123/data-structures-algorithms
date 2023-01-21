import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char letter = in.next().trim().charAt(0);

        if(letter>='a' && letter<='z'){
            System.out.println("Lowercase");
        } else{
            System.out.println("Uppercase");
        }
    }
}
