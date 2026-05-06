#include<stdio.h>

int main(){
	int start,bs,fs,nf;
	
	printf("Enter the No of Block:");
	scanf("%d",&bs);
	
	int b[bs],i,j;
	for(i=0;i<bs;i++){
		b[i]  = 0;
	}
	
	printf("Enter the No of Files:");
	scanf("%d",&nf);
	
	for(i=0;i<nf;i++){
		
		printf("\nEnter the File-%d Starting Position:",i+1);
		scanf("%d",&start);

		printf("Enter the File-%d Size:",i+1);
		scanf("%d",&fs);

		int found = 0;
		for(j=start;j<fs+start;j++){
			if(b[j] == 1){
				found = 1;
				printf("File-%d  cannot  be allocated",i+1);
				break;
			}
		}
		if(found == 0){
			printf("File-%d  can be allocated",i+1);
			for(j=start;j<fs+start;j++){
				b[j] = 1;
			}
		}
	}
}
