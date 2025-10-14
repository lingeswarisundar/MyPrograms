#include<stdio.h>
#include<stdlib.h>
struct Node {
    struct Node *left;
    int data;
    struct Node *right;
};

struct Node *insertion(struct Node *subRoot,int val) {
    if(subRoot==NULL) {
        subRoot = (struct Node*)malloc(sizeof(struct Node));
        subRoot->data = val;
        subRoot->left = NULL;
        subRoot->right = NULL;
        return subRoot;      
    } else if(val < subRoot->data) {
        subRoot->left = insertion(subRoot->left,val);
    } else {
        subRoot->right = insertion(subRoot->right,val);
    }
}

int main() {
    int value[] = {50,30,70,20,40,60,80};
    int size = 7;
    int i = 0;
    struct Node *root = NULL;
    root = insertion(root,value[i]);
    while(i<size) {
       i++;
       insertion(root,value[i]);
    }
}
