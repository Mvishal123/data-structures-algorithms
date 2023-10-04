#include <stdio.h>

int push(int arr[], int maxlen, int top, int data){
    if(top == maxlen-1){
        printf("%s\n", "The stack is full");
    } else{
        top++;
        arr[top] = data;
    }

    return top;
}

int pop(int arr[], int top){
    if(top == -1){
        printf("The stack is empty"); 
    } else{
        top--;
    }
    return top;
}   

void viewData(int arr[], int top){
    for(int i = 0; i <=top; i++){
        printf("%d ", arr[i]);
    }
}

void main(){
    int array[5] = {};
    int maxlen = sizeof(array)/sizeof(int);
    // printf("%d", maxlen);
    int top = -1;

    // push
    top = push(array, maxlen, top, 1);
    top = push(array, maxlen, top, 2);
    top = push(array, maxlen, top, 3);
    top = push(array, maxlen, top, 4);
    top = push(array, maxlen, top, 5);

    // pop
    top = pop(array, top);
    top = pop(array, top);
    top = pop(array, top);
    top = pop(array, top);
    top = pop(array, top);

    
    viewData(array, top);
    }