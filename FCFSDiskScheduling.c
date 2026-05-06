#include<stdio.h>
#include<stdlib.h>

int main(){
	int n;
	printf("Enter the No of Block:");
	scanf("%d",&n);
	int b[n],i;
	for(i=0;i<n;i++){
		printf("Enter the Block-%d No:",i+1);
		scanf("%d",&b[i]);
	}
	int head;
	printf("Enter the head :");
	scanf("%d",&head);
	int total = 0;
	for(i=0;i<n;i++){
	    printf("\nPointer move from %d to %d",head,b[i]);
		total+=abs(head-b[i]);
		head = b[i];
		
	}
	printf("\nTotal cost is %d",total);
}
