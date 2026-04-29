#include<stdio.h>
int main() {
	int i,j;
	int bs;
	printf("Enter the no of blocks : ");
	scanf("%d",&bs);
	int blocks[bs];
	printf("Enter the block sizes : ");
	for (i=0;i<bs;i++) {
		scanf("%d",&blocks[i]);
	}
	int ps;
	printf("Enter the no of prcocess : ");
	scanf("%d",&ps);
	int processes[ps];
	printf("Enter the process sizes : ");
	for(i=0;i<ps;i++){
		scanf("%d",&processes[i]);
	}
	int allocation[ps];
	for(i=0;i<ps;i++) {
		allocation[i] = -1;
	}
	for (i=0;i<ps;i++){
	    int worst = -1;
		for(j=0;j<bs;j++){
			if(blocks[j]>=processes[i]) {
			    if(worst==-1 || blocks[j]>blocks[worst]) {
			        worst = j;
			    }
			}
		}
		allocation[i] = worst;
		blocks[worst] = -1;
	}
	printf("Process\tAllocationBlock");
	for(i=0;i<ps;i++){
		printf("\n");
		if(allocation[i]==-1){
			printf("%d\tNot Allocated",i+1);
			continue;
		}
		printf("%d\t%d",i+1,allocation[i]);
	}
}

