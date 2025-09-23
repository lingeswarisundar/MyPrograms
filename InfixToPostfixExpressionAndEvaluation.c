#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>

struct Node {
    char data;
    struct Node *next;
};

struct Node *top = NULL;
struct Node *stack = NULL;
struct Node *postfix = NULL;

int precedence(char op) {
    if(op=='+'||op=='-') {
        return 1;
    } else if (op=='*'||op=='/') {
        return 2;
    } else if(op=='^'){
        return 3;
    } else {
        return 0;
    }
}

void pop() {
    stack = stack->next;
}

void push (char c) {
    struct Node *newStack = NULL; 
    newStack = (struct Node *)malloc(sizeof(struct Node)); 
    newStack->data = c;
    if(isdigit(c)) {
        if(top==NULL) {
            postfix = newStack;
            top = postfix;
        } else {
            postfix->next = newStack;
            postfix = postfix->next;  
        }     
    } else {
        if(c==')') {
            while(stack->data!='(') {
                postfix->next = (struct Node *)malloc(sizeof(struct Node)); 
                postfix->next->data = stack->data;
                postfix = postfix->next;
                pop();  
            }
            pop();  
        } else {
            int operator = precedence(c);
            int preOperator = stack!= NULL ? precedence(stack->data):0;
            if(stack==NULL) {
                stack = newStack;
            } else if(operator > preOperator||c=='(') {
                  newStack->next = stack;
                  stack = newStack;    
            } else {
                  postfix->next = (struct Node *)malloc(sizeof(struct Node)); 
                  postfix->next->data = stack->data;
                  postfix = postfix->next;     
                  pop();
                  if(stack==NULL) {
                      stack = newStack;
                  } else {
                      newStack->next = stack;
                      stack = newStack;
                  }
            }
         }   
    }
} 

char operation (char c1,char c2,char op) {
    int n1 = c1 - '0';
    int n2 = c2 - '0';
    char sum;
    if (op=='+') {
        sum = (n1+n2) +'0';
    } else  if (op=='-') {
        sum = (n1-n2) +'0';
    } else  if (op=='*') {
        sum = (n1*n2) +'0';
    } else  if (op=='/') {
        sum = (n1/n2) +'0';
    } else  if (op=='%') {
        sum = (n1%n2) +'0';
    } else {
        sum = (n1^n2) +'0';
    }
    return sum;
}

char evaluation () {
    struct Node *n1 = top;
    struct Node *n2 = n1->next;
    struct Node *op = n2->next;
    char sum;
    struct Node *sumStack = NULL;
    while(n1!=NULL) {
        if(isdigit(n1->data)) {
            if(isdigit(n2->data)&&isdigit(op->data)) {
                sumStack = (struct Node *)malloc(sizeof(struct Node));
                sumStack->data = n1->data;
                sum = operation(n2->data,op->data,op->next->data);
                n1 = op->next->next;
            } else if(isdigit(n2->data)) {
                sum = operation(n1->data,n2->data,op->data);
                n1 = op->next;
            } else {
                sum = operation (sumStack->data,n1->data,n2->data);
                sumStack = sumStack->next;
                n1 = op;
            }
        } else {
            sum = operation (sumStack->next->data,sumStack->data,n1->data);
            n1 = n2;
            sumStack = sumStack->next->next;
        }      
        if(sumStack==NULL){
            sumStack = (struct Node *)malloc(sizeof(struct Node));
            sumStack->data = sum;
        } else {
            struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
            newNode->data = sum;
            newNode->next = sumStack;
            sumStack = newNode;
        }
        if(n1!=NULL) {
            n2 = n1->next;
        }
        if(n2!=NULL) {
            op = n2->next;    
        }
    }
    return sum;
} 

void display (){
    struct Node *st = top;
    printf("Stack is ");
    while(st!=NULL){
        printf("%c",st->data);
        st = st->next;
    }
} 
 
int main () {
    char infix[20];
    printf("Enter the expression :");
    scanf("%s",infix);
    int i = 0;
    while(infix[i]!='\0') {
        push(infix[i]);
        i++;
    }
    postfix->next = stack;
    display();
    int sum = evaluation()-'0';
    printf("\n%d",sum);
}
    
