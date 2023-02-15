import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String name = "";
        char[] array = name.toLowerCase().toCharArray();

        if(palindromeChecker(array)){
            System.out.println("It is in palindrome");
        } else{
            System.out.println("Not in palindrome");
        }
    }

    static boolean palindromeChecker(char[] array){
        int first = 0;
        int last = array.length-1;

        while(first <= last){
            if(array[first] == array[last]){
                first++;
                last--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}

