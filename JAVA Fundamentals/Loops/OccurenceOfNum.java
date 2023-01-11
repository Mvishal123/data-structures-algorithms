import java.util.Scanner;

public class OccurenceOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = in.nextInt();
        int number = num;
        System.out.print("Occurence for which number: ");
        int n = in.nextInt();

        int count = 0;
        while(num != 0){
            int temp = num;
            temp = num%10;
            num = num/10;
            if(temp == n)
                count++;
        }
        System.out.println(n + " appears " + count + " times in " + number);
    }
}
