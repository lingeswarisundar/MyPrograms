#include<stdio.h>
#include <string.h>
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
struct Node *oddStart;
struct Node *evenStart;
void splitOddEven(){
     oddStart = start;
     evenStart = start->next;
     struct Node *odd = oddStart;
     struct Node *even = evenStart;
     struct Node *list = even->next!=NULL?even-> next:NULL;
     while(list != NULL){
            odd -> next = list;
            odd = odd -> next;
            list = list -> next;
            if(list!=NULL){
               even->next = list;
               even = even->next;
               list = list->next;
            }   
      }
      if(odd->next==NULL){
          even->next = NULL;
      } 
      else {
          odd->next = NULL;
      }
}
void display(struct Node *ptr){
     printf("[ ");
     while(ptr!=NULL){
            printf("%d ",ptr->data);
            ptr = ptr->next;
     }
     printf("]\n");
}
int main(){
    create();
    splitOddEven();
    printf("ODD LIST\n");
    display(oddStart);
    printf("EVEN LIST\n");
    display(evenStart);
}         
