#include<stdio.h>
#define MAX 5
int front = -1;
int rear = -1;
int queue[MAX];

void enqueue() {
    if(front==(rear+1)%MAX) {
        printf("Queue is full");
    } else {
          if (front==-1) {
              front++;
          }  
          rear = (rear+1)%MAX;
          printf("Enter the element :");
          scanf("%d",&queue[rear]); 
    } 
}

void dequeue() {
    if(front==-1) {
        printf("Queue is Underflow");
    } else {
        front++;
    }
    if(front%MAX==(rear+1)%MAX) {
        front = -1;
        rear = -1;
    }
}

void display() {
    int i = front;
    printf("Circular Queue :");
    do {
        printf("%d ",queue[i]);
        i = (i+1)%MAX;
    }
    while(i!=(rear+1)%MAX);
}

int main () {
    enqueue();
    enqueue();
    enqueue();
    enqueue();
    enqueue();
    enqueue();
    enqueue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    dequeue();
    display();
}
