#include<stdio.h>
#define MAX 5
int front = -1;
int rear = -1;
int cqfront = -1;
int cqrear = -1;
int queue[MAX];
int cirQueue[MAX];
void enqueue() {
    if (front==-1) {
        front++;
    }  
    if(rear==MAX-1) {
        printf("Queue is Overflow");
    } else {
        printf("Enter the element :");
        scanf("%d",&queue[++rear]); 
    } 
}

void dequeue() {
    if(front>rear||front==-1) {
        printf("Queue is Underflow");
    } else {
        front++;
    }
}

void display() {
    int i;
    printf("Queue :");
    for (i = front;i<=rear;i++) {
        printf("%d ",queue[i]);
    }
}

void cqEnqueue() {
    if(cqfront==(cqrear+1)%MAX) {
        printf("Queue is full");
    } else {
          if (cqfront==-1) {
              cqfront++;
          }  
          cqrear = (cqrear+1)%MAX;
          printf("Enter the element :");
          scanf("%d",&cirQueue[cqrear]); 
    } 
}

void cqDequeue() {
    cqfront++;
    if(cqfront==-1) {
        printf("Queue is Underflow");
    }
    if((cqrear+1)%MAX==cqfront) {
        cqfront = -1;
        cqrear = -1;
    }
}

void cqDisplay() {
    int i = cqfront;
    printf("Circular Queue :");
    do {
        printf("%d ",cirQueue[i]);
        i = (i+1)%MAX;
    }
    while(i!=(cqrear+1)%MAX);
}

int main() {
    int opchoice ;
    int quchoice ;
    while(opchoice!=3) {
        printf("1.Queue Operations\n2.CircularQueue Opertions\n3.Exit");
        printf("\nEnter your choice :");
        scanf("%d",&opchoice);
        if(opchoice == 1) {
            printf("\nQueue Operations are\n");
            printf("1.EnQueue\n2.DeQueue\n3.Display\n4.Exit");
            while(quchoice!=4) {
                printf("\nEnter your choice :");
                scanf("%d",&quchoice);
                switch (quchoice) {
                    case 1:
                        enqueue();
                        break;
                    case 2:
                        dequeue();
                        break;
                    case 3:
                        display();
                        break;        
                } 
            }
         }
         else if(opchoice == 2) {
            printf("\nCircularQueue Operations are\n");
            printf("1.CircularQueue EnQueue\n2.CircularQueue DeQueue\n3.CircularQueue Display\n4.Exit");
            while(quchoice!=4) {
                printf("\nEnter your choice :");
                scanf("%d",&quchoice);
                switch (quchoice) {
                    case 1:
                        cqEnqueue();
                        break;
                    case 2:
                        cqDequeue();
                        break;
                    case 3:
                        cqDisplay(); 
                        break;       
                } 
            }
        }
        quchoice = 0;               
    }
    printf("The program Ended...");
}
