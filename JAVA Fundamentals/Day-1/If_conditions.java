package vishal;

import java.util.Scanner;

public class If_conditions {
    public static void main(String[] args) {
        String password = "Password123";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pass = input.next();
        if(pass == password){
            System.out.println("Logged in!");
        }
        //else{
        //    System.out.println("Wrong password. Try again.");
        //}



    }
}
