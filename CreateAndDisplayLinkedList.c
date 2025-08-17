#include<stdio.h>
#include<stdlib.h>
struct Node {
    int data;
    struct Node *next;
};
struct Node *start = NULL;
void create(){
     struct Node *ptr;
     struct Node *newNode;
     int size;
     printf("Enter the size :");
     scanf("%d",&size);
     printf("Enter the data\n");
     int i;
     for(i=0;i<size;i++){
         newNode = (struct Node*)malloc(sizeof(struct Node));
         scanf("%d",&newNode->data);
         newNode->next = NULL;
         if(start==NULL){
             start = newNode;
             ptr = newNode;  
         }
         else{
             ptr->next = newNode;
             ptr = ptr->next;
         }
     }
}
void display(){
     struct Node *ptr = start;
     printf("LinkedList\n");
     printf("[ ");
     while(ptr!=NULL){
            printf("%d ",ptr->data);
            ptr = ptr->next;
     }
     printf("]\n");
}
int main(){
    create();
    display();
}    
