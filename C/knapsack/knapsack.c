#include <stdio.h>
#include <stdlib.h>
#define SIZE 5

struct Item {
  int profit;
  int weight;
  double ratio;
};

void addItems(struct Item *arr, int i, int profit, int weight) {
  arr[i].profit = profit;
  arr[i].weight = weight;
  arr[i].ratio = (double)profit / weight;
}

void swap(struct Item *arr, int i, int j) {
  struct Item temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

int partition(struct Item *arr, int low, int high) {
  double pivot = arr[high].ratio;
  int i = (low - 1);

  for (int j = low; j <= high - 1; j++) {
    if (arr[j].ratio > pivot) {
      i++;
      swap(arr, i, j);
    }
  }
  swap(arr, i + 1, high);
  return (i + 1);
}

void quicksort(struct Item *arr, int low, int high) {
  if (low < high) {
    int pi = partition(arr, low, high);
    quicksort(arr, low, pi - 1);
    quicksort(arr, pi + 1, high);
  }
}

float knapsack(struct Item *arr, int capacity) {
  float profit = 0;
  int currentWeight = 0;
  for (int i = 0; i < SIZE; i++) {
    struct Item item = arr[i];
    if (currentWeight + item.weight <= capacity) {
      profit += item.profit;
      currentWeight += item.weight;
    } else {
      int remainingWeight = capacity - currentWeight;
      profit += (remainingWeight * item.ratio);
      break;
    }
  }
  return profit;
}

int main() {
  struct Item *itemsArr = (struct Item *)(malloc(SIZE * sizeof(struct Item)));

  addItems(itemsArr, 0, 15, 5);
  addItems(itemsArr, 1, 12, 4);
  addItems(itemsArr, 2, 10, 3);
  addItems(itemsArr, 3, 18, 9);
  addItems(itemsArr, 4, 12, 2);

  quicksort(itemsArr, 0, SIZE - 1);

  // for (int i = 0; i < SIZE; i++) {
  //   printf("%f\n ", itemsArr[i].ratio);
  // }

  int capacity = 11;
  float maxProfit = knapsack(itemsArr, capacity);
  printf("The maximum profit: %f", maxProfit);

  return 0;
}
