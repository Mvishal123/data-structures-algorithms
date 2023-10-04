# include<stdio.h>
# include<stdlib.h>

struct node{
    int data;
    struct node* next;
};


void addNodeAtEnd(struct node *head, int value){
    struct node *temp, *ptr;
    ptr = head;

    temp = malloc(sizeof(struct node));
    temp -> data = value;
    temp -> next = NULL;

    while(ptr-> next != NULL){
        ptr = ptr -> next;
    }
    ptr -> next = temp;
}

void numberOfNodes(struct node *ptr){
    if(ptr == NULL){
        printf("%s", "The Linkedlist is empty");
    }else{
    int count = 0;
    while(ptr != NULL){
        count++;
        ptr = ptr -> next;
    }
    printf("%d\n", count);
    }
}

void viewData(struct node *ptr){
    if(ptr == NULL){
        printf("%s", "The Linkedlist is empty");
    }else{
    while(ptr != NULL){
    printf("%d\n", ptr-> data);
    ptr = ptr -> next;
    }
}
}

void main(){
    struct node* head;
    head = malloc(sizeof(struct node));
    head -> data = 23;
    head -> next = NULL;

    addNodeAtEnd(head, 45);
    addNodeAtEnd(head, 65);
    addNodeAtEnd(head, 52);
    addNodeAtEnd(head, 31);
    addNodeAtEnd(head, 12);
    addNodeAtEnd(head, 521);
    viewData(head);

}