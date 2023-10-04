#include <stdio.h>

void swap(int arr[], int max, int end){
    int temp = arr[max];
    arr[max] = arr[end];
    arr[end] = temp;
}

void sort(int arr[], int len){
    for(int i = 0; i < len - 1; i++){
        for(int j = i+1; j > 0; j--){
            if(arr[j-1] < arr[j]){
                break;
            } else{
                swap(arr, j, j-1);
            }   
        }
    }
}


void viewData(int arr[], int len){
    for(int i = 0; i < len; i++){
        printf("%d ", arr[i]);
    }
}

void main(){
    int array[] = {5, 4, 3, 2, 1};
    int len = sizeof(array)/sizeof(int);

    sort(array, len);
    viewData(array, len);
    }