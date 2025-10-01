import java.util.Scanner;

class StackImplementation {
    int size = 5;
    int[] stack = new int[size];
    int top = -1;
   
    void push(int n) {
        top++;
        stack[top] = n;
    }
   
    void pop() {
        top--;
    }
   
    void isFull() {
        if(top==size-1) {
            System.out.println("Stack is Full");
        } else {
            System.out.println("Stack is Not Full");
        }
    }
   
    void isEmpty() {
        if(top==-1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is Not Empty");
        }
    }
   
    void display() {
        System.out.println("Stack is ");
        for (int i = top;i<=0;i--) {
            System.out.println(stack[i]+" ");
        }
    }
}

class ArrayStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackImplementation si = new StackImplementation();
        System.out.println("1.Push 2.Pop 3.Display 4.IsFull 5.IsEmpty 6.Exit");
        int choice = 0;
        while(choice!=6) {
           System.out.print("Enter your choice :");
           choice = sc.nextInt();
           switch(choice) {
               case 1:
                   System.out.print("Enter your element :");
                   int n = sc.nextInt();
                   si.push(n);
                   break;
               case 2:
                   si.pop();
                   System.out.println("Element popped Successfully");
                   break;
               case 3:
                   si.display();
                   break;
               case 4:
                   si.isFull();
                   break;
               case 5:
                   si.isEmpty();
                   break;
               case 6:
                    System.out.println("Program Ended...");
           }
        }
    }
}
