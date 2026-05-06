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
	while(b[left]<=head) {
	    left++;
	}
	left--;
	int right = left+1;
	int total = 0;
	while(right<=n-1) {
        int costRight = abs(head-b[right]);
	    printf("\nPointer move from %d to %d",head,b[right]);
        total+=costRight;
        head = b[right];
        right++;   
	}
	total+=abs(b[right-1]-b[0]);
	head = b[0];
	for (i=1;i<=left;i++) {
	    int costLeft = abs(head-b[i]);
	    printf("\nPointer move from %d to %d",head,b[i]);
        total+=costLeft;
        head = b[i]; 
	}
	printf("\nTotal cost is %d",total);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
