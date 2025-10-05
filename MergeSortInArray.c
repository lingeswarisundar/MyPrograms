#include<stdio.h>
int main() {
    int arr1[] = {1,2,7,8};
    int arr2[] = {2,4,6,9};
    int total = 8;
    int newArray[total];
    int iteration;
    int arrSize1 = 4;
    int i = 0;
    int j = 0; 
    int k = 0;
    for (iteration=0;iteration<total;iteration++) {
        if(i<arrSize1&&arr1[i]<arr2[j]) {
            newArray[k] = arr1[i];
            k = k+1;
            i = i+1;
        } else {
            newArray[k] = arr2[j];
            k = k+1;
            j = j+1;
        }
    }
    for(i=0;i<total;i++) {
        printf("%d ",newArray[i]);
    }
}
