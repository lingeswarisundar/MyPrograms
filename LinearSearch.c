#include <stdio.h>
int main() {
    int n, key, i, found=0;
    printf("Enter size: ");
    scanf("%d",&n);
    int a[n];
    printf("Enter elements: ");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }    
    printf("Enter search element: ");
    scanf("%d",&key);
    for(i=0;i<n;i++){
         if(a[i]==key) { 
             found=1;
              break; 
         }
    }     
    if(found) {
        printf("Element found at index %d", i);
    }
    else{ 
        printf("Element not found");
    }    
    return 0;
}
