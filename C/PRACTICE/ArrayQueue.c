#include <stdio.h>
#define capacity 5;
int arr[capacity];
int pos = -1;
int top = 0;

int isFull(){
    if(pos == capacity-1){
        return 1;
    }
    else{
        return 0;
    }
}

int isEmpty(){
    if(pos == -1){
        return 1;
    }
    else{
        return 0;
    }
}

void enqueue(int data){
    if(isFull() == 1){
        printf("The queue is full");
    }
    else{
        arr[++pos] = data;
    }
}

int dequeue(){
    if(isEmpty() == 1){
        printf("The array is empty");
    }
    else{
        for(int i = 0; i < pos; i++){
            int temp = arr[i];
            arr[i] = arr[i+1]; 
            arr[i+1] = temp;
        }

        printf("Dequeued element : %d\n", arr[pos]);
        pos--;
    }
}

void peek(){
    if(isEmpty() == 1){
        printf("The Queue is empty");
    }
    else{
        printf("Peek element: %d\n", arr[top]);
    }
}

void main(){
    int choice, data;

    do{
        printf("-----QUEUE OPERATIONS-----\n1) Enqueue\n2) Dequeue\3) Peek\n 4)ViewData\n5) Exit");
    } while(choice);
}