#include <stdio.h>
#include <stdlib.h>

// stack using array

struct node{
    int data;
    struct node *next;
};

struct node* push(struct node *head, int data){
    struct node *temp = malloc(sizeof(struct node));
    temp -> data = data;
    temp -> next = head;
    head = temp;
    return head;
}

struct node* pop(struct node *head){
    struct node *ptr = head;
    head = head -> next;
    free(ptr);
    return head;
}

void peak(struct node* head){
   printf("the peak element is %d\n", head -> data); 
}

                                                         
void viewData(struct node *head){
    struct node *ptr = head;
     while(ptr != NULL){
        printf("%d\n", ptr -> data);
        ptr = ptr -> next;
     }
}

void main(){
    struct node *head = malloc(sizeof(struct node));
    head -> data = 1;
    head -> next = NULL;
    head = push(head, 2);
    head = push(head, 3);
    head = push(head, 4);
    head = push(head, 5);

    head = pop(head);
    peak(head);

    viewData(head);
}