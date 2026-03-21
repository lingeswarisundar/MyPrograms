#include<stdio.h>
int main() {
	int p;
	printf("Enter the no of processes :");
	scanf("%d",&p);
	int r;
	printf("Enter the no of resources :");
	scanf("%d",&r);
	int i,j;
	int allocation[p][r];
	for(i=0;i<p;i++){
		printf("Enter the %d process allocation matrix :",i+1);
		for(j=0;j<r;j++){
			scanf("%d",&allocation[i][j]);
		}
	}
	printf("\n");
	int max[p][r];
	for(i=0;i<p;i++){
		printf("Enter the %d process max allocation matrix :",i+1);
		for(j=0;j<r;j++) {
			scanf("%d",&max[i][j]);
		}
	}
	printf("\n");
	int need[p][r];
	for(i=0;i<p;i++){
		for(j=0;j<r;j++) {
			need[i][j] = max[i][j]-allocation[i][j];
		}
	}
	int available[r];
	printf("Enter the available matrix resources :");
	for(i=0;i<r;i++){
		scanf("%d",&available[i]);
	}
	int count = 0;
	int finish[p];
	int sequence[p];
	while(count < p) {
		for(i=0;i<p;i++) {
			if(finish[i]==1){
				continue;
			}
			int found = 1;
			for(j=0;j<r;j++){
				if(need[i][j] > available[j]) {
					found = 0;
					break;
				}
			}
			if(found==1){			
				for(j=0;j<r;j++) {
					available[j]+=allocation[i][j];
				}	
				finish[i] = 1;
				sequence[count] = i;
				count++;
			}
		}
	}
	printf("\n");
	printf("The safe sequence is ");
	for(i=0;i<p;i++){
		printf(" %d",sequence[i]);
	}
	printf("\n");
}




