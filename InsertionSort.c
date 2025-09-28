#include<stdio.h>
int main() {
    int a[5];
    int i;
    printf("Enter 5 elements :\n");
    for(i=0;i<5;i++) {
        scanf("%d",&a[i]);
    }
    for(i=0;i<5;i++) {
        int key = a[i];
        int j = i-1;
        while(j>=0&&a[j]>key) {
            a[j+1] = a[j];
            j--;
        }
        a[j+1] = key;
    }
    printf("Sorted Array is ");
    for(i=0;i<5;i++) {
        printf("%d ",a[i]);
    }
}
