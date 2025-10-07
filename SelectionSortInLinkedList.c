#include<stdio.h>
#include<stdlib.h>
struct Node {
    int data;
    struct Node *next;
};

struct Node *create(){
     struct Node *start = NULL;
     struct Node *ptr = NULL;
     int size;
     printf("Enter the size :");
     scanf("%d",&size);
     printf("Enter the data\n");
     int i;
     for(i=0;i<size;i++){
         if(start==NULL){
             start = (struct Node*)malloc(sizeof(struct Node));
             scanf("%d",&start->data);
             ptr = start;  
         }
         else{
             ptr->next = (struct Node*)malloc(sizeof(struct Node));
             scanf("%d",&ptr->next->data);
             ptr = ptr->next;
         }
     }
     return start;
}

void selectionSort(struct Node *list){
    while(list->next!=NULL) {
        struct Node *nextList = list->next;
        struct Node *small = list;
        while(nextList!=NULL) {
            if(small->data > nextList->data) {
                small = nextList;
            }
            nextList = nextList->next;
        }
        int s = list->data;
        list->data = small->data;
        small->data = s;
        list = list->next;
    }
    printf("Sorted ");
}

void display(struct Node *ptr){
     printf("LinkedList\n");
     printf("[ ");
     while(ptr!=NULL){
            printf("%d ",ptr->data);
            ptr = ptr->next;
     }
     printf("]\n");
}

int main(){
    struct Node *list = create();
    selectionSort(list);
    display(list);
}    
