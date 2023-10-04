package Revision;

import java.util.Arrays;

public class Basics {
    static int sum(int ...nums){
        int sum = 0;
        for(int i : nums) {
            sum+=i;
        }
        return sum;
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}