package Intermediate;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n1: ");
        int num1 = in.nextInt();
        System.out.print("n2: ");
        int num2 = in.nextInt();

        int hcf = 0, i=1;
        if(num1>num2)
            while(i<=num2) {
                if (num1 % i == 0 && num2 % i == 0)
                    if (i > hcf)
                        hcf = i;
                i++;
            }
        i = 1;
        if(num2>num1)
            while(i<=num1){
                 if(num1%i==0 && num2%i==0)
                      if(i>hcf)
                          hcf = i;
                 i++;
            }
        System.out.println(hcf);



    }
}

