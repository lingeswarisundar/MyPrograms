#include<stdio.h>
#include<stdlib.h>
#include <stdbool.h>
struct Node {
    int data;
    struct Node *next;
};
struct Node *start = NULL;
void create(){
    struct Node *ptr,*newNode;
    int val,size = 0;
    printf("Enter the size :");
    scanf("%d",&size);
    printf("Enter the elements :\n");
    for(int i=0;i<size;i++){
        scanf("%d",&val);
        newNode = (struct Node *)malloc(sizeof(struct Node));
        newNode->data = val;
        newNode->next = NULL;
        if(start == NULL){
            start = newNode;
            ptr = start;
        }
        else{
            ptr->next = newNode;
            ptr = ptr->next;
        }
    }
}

void insertAtBegin(){
    struct Node *newNode;
    int val;
    newNode = (struct Node *)malloc(sizeof(struct Node));
    printf("Enter the elements :");
    scanf("%d",&val);
    newNode->data = val;
    newNode->next = start;
    start = newNode;
}

void insertAtEnd(){
    struct Node *newNode;
    struct Node *ptr = start;
    int val;
    newNode = (struct Node *)malloc(sizeof(struct Node));
    printf("Enter the elements :");
    scanf("%d",&val);
    newNode->data = val;
    newNode->next = NULL;
    if(start==NULL){
        start = newNode;
    }
    else{
       while(ptr->next!=NULL){
           ptr = ptr->next;
       }
    }
    ptr->next = newNode;
}

void insertInMiddle(){
    struct Node *newNode;
    struct Node *prePtr = start;
    struct Node *ptr = start->next;
    int val,index;
    newNode = (struct Node *)malloc(sizeof(struct Node));
    printf("Enter the elements :");
    scanf("%d",&val);
    printf("Enter the index :");
    scanf("%d",&index);
    newNode->data = val;
    for(int i=0;i<index-1;i++){
        ptr = ptr->next;
        prePtr = prePtr->next;
    }
    prePtr->next = newNode;
    newNode->next = ptr;
}

void deleteFromBegin(){
    start = start->next;
}

void deleteFromEnd(){
    struct Node *ptr = start;
    while(ptr->next->next!=NULL){
        ptr = ptr->next;
    }
    ptr->next = NULL;
}

void deleteFromMiddle(){
    int index;
    struct Node *prePtr = start;
    struct Node *ptr = start->next;
    printf("Enter the index :");
    scanf("%d",&index);
    for(int i=0;i<index-1;i++){
        ptr = ptr->next;
        prePtr = prePtr->next;
    }
    prePtr->next = ptr->next;
}

bool searchData(){
    int ele;
    struct Node *ptr = start;
    printf("Enter the element :");
    scanf("%d",&ele);
    while(ptr!=NULL){
        if(ptr->data==ele){
            return true;
        }
        ptr = ptr->next;
    }
    return false;
}

void display(){
    struct Node *ptr = start;
    if(start==NULL){
        printf("Linked List is Empty");
    }
    else{
        printf("[ ");
        while(ptr!=NULL){
            printf("%d ",ptr->data);
            ptr = ptr->next;
        }
        printf("]");
    }
}
int main (){
    int choice = 0;
    printf("1.Create LinkedList\n2.Insert at beginning\n3.Insert at end\n4.Insert in middle\n5.Delete from beginning\n6.Delete from end\n7.Delete from middle\n8.Search for data\n9.Print the list\n10.Exit");
    while(choice!=10){
        printf("\nEnter the choice :");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                create();
                break;
            case 2:
               insertAtBegin();
               break;
            case 3:
               insertAtEnd();
               break;
            case 4:
               insertInMiddle();
               break;
            case 5:
               deleteFromBegin();
               break;
            case 6:    
                deleteFromEnd();
                break;
            case 7:
               deleteFromMiddle();
               break;
            case 8:
                bool searchElement = searchData();
                if(searchElement){
                printf("The element exist in the linkedlist");
                }
                else {
                printf("The element not exist in the linkedlist");
                }
                break;
            case 9:
                display();
                break;
            case 10:
                printf("The program Ended");
                break;
            default :
               printf("Invalid Choice");
            }  
    }
}


