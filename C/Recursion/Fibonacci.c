#include <stdio.h>

int fibo(int n){
    if(n < 2){
        return n;
    }

    return fibo(n-1) + fibo(n-2);
}



void main(){
    int number = 10;
    printf("Factorial of %d:  %d", number, fibo(number));
}