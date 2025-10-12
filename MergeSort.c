#include <stdio.h>
void display (int a[]){
    int i=0;
    for(i=0;i<5;i++){
        printf("%d ",a[i]);
    }
}

void merge(int a[],int beg,int mid,int end) {
    int i=beg;
    int k=beg;
    int j=mid+1;
    int temp[end+1];
    while(i<=mid&&j<=end){
        if(a[i]<a[j]){
            temp[k]=a[i];
            k++;
            i++;
        } else {
            temp[k]=a[j];
            k++;
            j++;
        }
    }
    if(i<=mid) {
        while(i<=mid) {
            temp[k]=a[i];
            k++;
            i++;    
        }
    } else {
        while(j<=end) {
            temp[k]=a[j];
            k++;
            j++;    
        }
    }
    k--;
    while(k>=beg){
        a[k]=temp[k];
        k--;
    }
}

void mergeSort(int a[],int beg,int end){
    if(beg<end){
        int mid =(beg+end)/2;
        mergeSort(a,beg,mid);
        mergeSort(a,mid+1,end);
        merge(a,beg,mid,end);
    }
}

int main() {
    int myNumbers[] = {1,4,3,3,1};
    printf("Original Array\n");
    display(myNumbers);
    mergeSort(myNumbers,0,4);
    printf("\nSorted Array\n");
    display(myNumbers);
    return 0;
}
