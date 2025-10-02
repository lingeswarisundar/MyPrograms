import java.util.Scanner;

class QueueImplementation {
    int size = 5;
    int[] queue = new int[size];
    int front = -1;
    int rear = -1;
   
    void enqueue(int n) {
        if(front==-1) {
            front++;
        }
        rear++;
        queue[rear] = n;
    }
   
    void dequeue() {
        front++;
    }
   
    void isFull() {
        if(rear==size-1) {
            System.out.println("Queue is Full");
        } else {
            System.out.println("Queue is Not Full");
        }
    }
   
    void isEmpty() {
        if(front>rear||front==-1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue is Not Empty");
        }
    }

     void display() {
        System.out.println("Queue is ");
        for (int i = front;i<=rear;i++) {
            System.out.println(queue[i]+" ");
        }
    }
}

class ArrayQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueImplementation qi = new QueueImplementation();
        System.out.println("1.EnQueue 2.DeQueue 3.Display 4.IsFull 5.IsEmpty 6.Exit");
        int choice = 0;
        while(choice!=6) {
           System.out.print("Enter your choice :");
           choice = sc.nextInt();
           switch(choice) {
               case 1:
                   System.out.print("Enter your element :");
                   int n = sc.nextInt();
                   qi.enqueue(n);
                   break;
               case 2:
                   qi.dequeue();
                   System.out.println("First element dequeued Successfully");
                   break;
               case 3:
                   qi.display();
                   break;
               case 4:
                   qi.isFull();
                   break;
               case 5:
                   qi.isEmpty();
                   break;
               case 6:
                    System.out.println("Program Ended...");
           }
        }
    }
}
