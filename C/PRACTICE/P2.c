#include <stdio.h>

void swap(int arr[], int max, int end){
    int temp = arr[max];
    arr[max] = arr[end];
    arr[end] = temp;
}

void sort(int arr[], int len){
    int end = len - 1;
    for(int i = 0; i < len - 1; i++){
        int max = 0;
        for(int j = 1; j < len-i; j++){
            if(arr[j] > arr[max]){
                max = j;
            }
        }
        swap(arr, max, end);
        end--;
    }
}


void viewData(int arr[], int len){
    for(int i = 0; i < len; i++){
        printf("%d ", arr[i]);
    }
}

void main(){
    int array[] = {-2, -12, -332, 12, 34, 1, 0};
    int len = sizeof(array)/sizeof(int);

    sort(array, len);
    viewData(array, len);
    }