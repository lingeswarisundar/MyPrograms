#include<stdio.h>
int main () {
    char a[3];
    a[0] = '1';
    a[1] = '+';
    a[2] = '3';
    int i = a[0] - '0';
    int j = a[2] - '0';
    if (a[1]=='+') {
        printf("%d",i+j);
    }
}    
