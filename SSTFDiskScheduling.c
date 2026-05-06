#include<stdio.h>
#include<stdlib.h>
int main(){
	int n;
	printf("Enter the No of Block:");
	scanf("%d",&n);
	int b[n],i,j;
	for(i=0;i<n;i++){
		printf("Enter the Block-%d No:",i+1);
		scanf("%d",&b[i]);
	}
	int head;
	printf("Enter the head :");
	scanf("%d",&head);
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			if(b[i] < b[j]){
				int temp = b[i];
				b[i] = b[j];
				b[j] = temp;
			}
		}
	}
	int left = 0;
	int right = n-1;
	while(b[left]<=head) {
	    left++;
	}
	left--;
	while(b[right]>=head) {
	    right--;
	}
	right++;
	int total = 0;
	while(left>=0&&right<=n-1) {
	    int costLeft = abs(head-b[left]);
	    int costRight = abs(head-b[right]);
	    if(costLeft < costRight) {
	        printf("\nPointer move from %d to %d",head,b[left]);
	        total+=costLeft;
	        head = b[left];
	        left--; 
	    }  else {
	        printf("\nPointer move from %d to %d",head,b[right]);
	        total+=costRight;
	        head = b[right];
	        right++;
	    }
	}
	while(left>=0) {
	    int costLeft = abs(head-b[left]);
	    printf("\nPointer move from %d to %d",head,b[left]);
        total+=costLeft;
        head = b[left];
        left--;     
	}
	while(right<=n-1) {
        int costRight = abs(head-b[right]);
	    printf("\nPointer move from %d to %d",head,b[right]);
        total+=costRight;
        head = b[right];
        right++;   
	}
	printf("\nTotal cost is %d",total);
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
