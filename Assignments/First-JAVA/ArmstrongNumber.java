package Assignments;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number1: ");
        int n1 = in.nextInt();
        System.out.print("Number2: ");
        int n2 = in.nextInt();

        for(int i = n1+1; i<n2; i++){
            int temp = i;
            int pow=0, digit;
            while(temp != 0){
                temp = temp/10;
                pow++;
            }

            int out_num = 0;
            temp = i;
            while(temp != 0){
                digit = temp%10;
                temp /= 10;
                out_num += (int)(Math.pow(digit, pow));
            }
            if(out_num == i)
                System.out.print(out_num + " ");
            else
                continue;


            }

        }
    }

