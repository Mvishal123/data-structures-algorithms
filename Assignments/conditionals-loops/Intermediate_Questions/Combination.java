package Intermediate;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n: ");
        int n = in.nextInt();
        System.out.print("r: ");
        int r = in.nextInt();

        int nr = n-r;
        int nf =1, rf = 1, nrf = 1, i = 1;
        while(i<=n){
            nf *= i;
            i++;
        }
        i = 1;
        while(i<=r){
            rf *= i;
            i++;
        }
        i=1;
        while(i<=nr){
            nrf *= i;
            i++;
        }
        int nCr = nf/(rf*nrf);
        System.out.println("nCr: "+nCr);
    }
}
