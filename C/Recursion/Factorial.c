#include <stdio.h>

int powered(int n, int pow){
    if(pow == 1){
        return n;
    }
    else{
        return n * powered(n, pow -1);
    }
}



void main(){
    int number = 2;
    int power = 6;
    printf("%d", powered(number, power));
}