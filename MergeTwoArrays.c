#include <stdio.h>
int main() {
    int n1,n2,i,j;
    printf("Enter size of first array: ");
    scanf("%d",&n1);
    int a[n1];
    for(i=0;i<n1;i++) {
        scanf("%d",&a[i]);
    }
    printf("Enter size of second array: ");
    scanf("%d",&n2);
    int b[n2];
    for(i=0;i<n2;i++) {
        scanf("%d",&b[i]);
    }
    int c[n1+n2];    
    for(i=0;i<n1;i++) {
         c[i]=a[i];
    }     
    for(j=0;j<n2;j++,i++) {
          c[i]=b[j];
    }      
    printf("Merged array: ");
    for(i=0;i<n1+n2;i++) {
        printf("%d ",c[i]);
    }    
    return 0;
}
