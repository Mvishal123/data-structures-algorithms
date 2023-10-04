#include <stdio.h>
#include <stdlib.h>


void swap(int arr[], int first, int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}

void sort(int array[], int len){
    for(int i = 0; i < len-1; i++){
        int swapped = 0;
        for(int j =  0; j < len-i-1; j++){
            if(array[j] > array[j+1]){
                swap(array, j, j+1);
                swapped = 1;
            }
        }

        if(swapped == 1){
            break;
        }
    }
}

void viewData(int arr[], int len){
    for(int i = 0; i < len; i++){
        printf("%d ", arr[i]);
    }
}

void main(){
    int arr[] = {1, 2, 3, 4, 5};

     int len = sizeof(arr)/sizeof(int);
     sort(arr, len);

     viewData(arr, len);
}