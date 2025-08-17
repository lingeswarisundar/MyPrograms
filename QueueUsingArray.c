#include <stdio.h>
#define MAX 5
int queue[MAX], front=0, rear=0;
void enqueue(int x) {
    if(rear==MAX-1) {
        printf("Overflow\n");
    }    
    else {
            queue[rear]=x;
            rear++;
        }    
}
void dequeue() {
    if(rear==0) {
       printf("Underflow\n");
    }   
    else{
       printf("Dequeued: %d\n", queue[front++]);
    }   
}
void display() {
    int i;
    for(i=front;i<rear;i++) {
        printf("%d ",queue[i]);
    }    
    printf("\n");
}
int main() {
    enqueue(10); 
    enqueue(20);
    enqueue(30); 
    display();
    dequeue(); 
    display();
    return 0;
}

