import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Vishal";
        char target = 's';
        boolean ans2 = search2(name, target);
        int ans1 = search(name, target);
        System.out.println(ans1);
    }
    // return the index of the char
    static int search(String name, char target){
        if(name.length() == 0)
            return -1;
        for (int element = 0; element < name.length(); element++) {
            if(target == name.charAt(element))
                return element;
        }
        return -1;
    }

    // returns if the char is present in the name or not
    static boolean search2(String name, char target){
        if(name.length() == 0)
            return false;
        for(char elements : name.toCharArray()){
            if (elements == target)
                return true;
        }
        return false;
    }
}
