#include <stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

void addNodeatEnd(struct node *head, int value){
    struct node *ptr, *temp;
    ptr = head;
    temp = malloc(sizeof(struct node));
    temp -> data = value;
    temp -> next = NULL;
    while(ptr -> next != NULL){
        ptr = ptr -> next;
    }
    ptr -> next = temp;
}

void numberOfNodes(struct node *head){
    struct node *ptr = head;
    int count = 0;
    while(ptr != NULL){
        count++;
        ptr = ptr -> next;
    }
    printf("The number of nodes in the linked list is %d\n",count);
}

void viewData(struct node *head){
    struct node *ptr = head;
     while(ptr != NULL){
        printf("%d\n", ptr -> data);
        ptr = ptr -> next;
     }
}

struct node* addNodeAtBeginning(struct node *head, int value){
    struct node *temp = malloc(sizeof(struct node));
    temp -> data = value;
    temp -> next = head;
    head = temp;
    return head;

}

void addAtCertainPosition(struct node *head, int pos, int data){
    struct node *temp = malloc(sizeof(struct node));
    temp -> data = data;
    temp -> next = NULL;
    struct node *ptr = head;
    
    int count = 1;
    while(count < pos -1){
        ptr = ptr -> next;
        count ++;
    }
    temp -> next = ptr -> next;
    ptr -> next = temp;
}

int findMid(struct node *head){
        struct node *ptr = head;
    int count = 0;
    while(ptr != NULL){
        count++;
        ptr = ptr -> next;
    }
    int mid = (1 + count)/2;
    return mid; 
}

void deleteAtCertainPosition(struct node *head, int mid){
    struct node* ptr = head;
    while(mid-1 > 1){
        ptr = ptr -> next;
        mid--;
    }
    struct node *temp = ptr -> next;
    ptr -> next = ptr -> next -> next;
    free(temp);
}




void main(){
    struct node *head = malloc(sizeof(struct node));
    head -> data = 1;
    head -> next = NULL;
    addNodeatEnd(head, 2);
    addNodeatEnd(head, 3);
    addNodeatEnd(head, 4);
    addNodeatEnd(head, 5);

    deleteAtCertainPosition(head, findMid(head));

    viewData(head);


    
}