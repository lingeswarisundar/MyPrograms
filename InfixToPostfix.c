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
    struct Node *newStack = (struct Node *)malloc(sizeof(struct Node)); 
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
        int operator = precedence(c);
        int preOperator = stack!= NULL ? precedence(stack->data):0;
        if(stack==NULL) {
            stack = newStack;
        } else if(operator > preOperator) {
           newStack->next = stack;
           stack = newStack;     
        } else {
            postfix->next = stack;
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
    postfix->next = stack;
}  

void display (){
    struct Node *st = top;
    printf("Stack is ");
    while(st!=NULL){
        printf("%c",st->data);
        st = st->next;
    }
} 
 
int main (){
    char infix[20];
    printf("Enter the expression :");
    scanf("%s",infix);
    int i = 0;
    while(infix[i]!='\0') {
        push(infix[i]);
        i++;
    }
    display();
}
    
