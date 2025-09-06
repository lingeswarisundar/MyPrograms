#include<stdio.h>
#include<stdlib.h>

struct Node {
   int power;    
   int coeff;
   struct Node *next;
};
 
struct Node *create() {
    struct Node *polyStart = NULL;
    struct Node *poly = NULL;
    int highPower;
    printf("\nEnter the highest power :");
    scanf("%d",&highPower);
    int i;
    for(i=highPower;i>=0;i--){
        struct Node *newPoly = (struct Node *)malloc(sizeof(struct Node));
        newPoly->power = i;
        printf("Enter the coeff for x^%d = ",i);
        scanf("%d",&newPoly->coeff);
        newPoly->next = NULL;
        if(polyStart == NULL){
           polyStart = newPoly;
           poly = newPoly;
        }
        else{
           poly->next = newPoly;
           poly = poly->next;
        }
    }
    return polyStart;
}

struct Node *add(struct Node *poly1,struct Node *poly2){
    struct Node *polySum = NULL;
    struct Node *polyStart = NULL;
    struct Node *newNode = NULL;
    while(poly1!=NULL){
        newNode = (struct Node*)malloc(sizeof(struct Node));
        if(poly1->power==poly2->power){
            newNode->power = poly1->power;
            newNode->coeff = poly1->coeff+poly2->coeff;
            poly1= poly1->next;
            poly2 = poly2->next;
        } else {
            newNode->power = poly1->power > poly2->power?poly1->power:poly2->power;
            newNode->coeff = poly1->power > poly2->power?poly1->coeff:poly2->coeff;
            if(poly1->power > poly2->power) {
                poly1 = poly1->next;
            } else {
                poly2 = poly2->next;
            }    
        }
        if(polyStart==NULL){
            polyStart = newNode;
            polySum = newNode;
        }
        else{
            polySum->next = newNode;
            polySum = polySum->next;
        }  
    }
    polySum->next = NULL;
    return polyStart;
}
    
struct Node *minus(struct Node *poly){
    struct Node *polyStart = NULL;
    while(poly!=NULL){
        poly->coeff = -1*poly->coeff;
        if (polyStart==NULL){
             polyStart = poly;
        }
        poly = poly->next;
    }
    return polyStart; 
}

void display(struct Node *poly){
    while(poly!=NULL){
        printf("%dx^%d ",poly->coeff,poly->power);
        if(poly->next!=NULL&&poly->next->coeff>=0) {
            printf("+ ");
        }
        poly = poly->next;
    }
}

int main(){
    struct Node *poly1 = create();
    struct Node *poly2 = create();
    printf("\n\nPolynomial Addition ");
    struct Node *polySum = add(poly1,poly2);
    display(polySum);
    struct Node *minusPoly = minus(poly2);
    printf("\n\nPolynomial Subtraction ");
    struct Node *polySub = add(poly1,minusPoly);
    display(polySub);
}  
