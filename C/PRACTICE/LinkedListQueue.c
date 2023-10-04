#include <stdlib.h>
#include <stdio.h>

struct node{
    int data;
    struct node* next;
};

//ziyaad
struct node* enqueueFirst(struct node* head, int data){
    struct node* temp = malloc(sizeof(struct node));
    temp -> data = data;
    temp -> next = NULL;
    
    if(head==NULL)
    {
        head=temp;
        return head;
    }
}

void enqueue(struct node* head, int data){
    struct node* temp = malloc(sizeof(struct node));
    temp -> data = data;
    temp -> next = NULL;
    
    //ziyaad
    if(head==NULL)
    {
        head=temp;
        return;
    }

    struct node* ptr = head;
    while(ptr -> next != NULL){
        ptr = ptr -> next;
    }
    ptr -> next = temp;
}

struct node* dequeue(struct node* head){
    //ziyaad
    if(head==NULL)
    {
        printf("QUEUE EMPTY");
        return head;
    }
    
    struct node* temp = head;
    head = head -> next;
    free(temp);
    return head;
}



void viewData(struct node* head){
    struct node* ptr = head;
    while(ptr != NULL){
        printf("%d\n", ptr -> data);
        ptr = ptr -> next;
   }
}

void peek(struct node* head){
    //ziyaad
    if(head==NULL)
    {
        printf("QUEUE EMPTY");
        return;
    }
    
    printf("The peek element is %d\n", head -> data);
}



void main(){
    struct node* head = NULL;
    // struct node* head = malloc(sizeof(struct node));
    // head -> data = 1;
    // head -> next = NULL;

    head = enqueueFirst(head, 1);
    enqueue(head, 2);
    enqueue(head, 3);
    enqueue(head, 4);
    enqueue(head, 5);
   
    viewData(head);
}