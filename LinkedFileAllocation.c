#include<stdio.h>

int main(){
	int bs,fs,nf;
	
	printf("Enter the No of Block:");
	scanf("%d",&bs);
	
	int b[bs],next[bs],i,j;
	for(i=0;i<bs;i++){
	   printf("Block-%d is allocated or not(0/1):",i);
	   scanf("%d",&b[i]);
	   next[i] = -1;
	}
	
	int start = 0; 
	int last = -1;
	
	printf("Enter the File Size:");
	scanf("%d",&fs);

	for(j=0;j<bs;j++){
		if(start < fs){
			if(b[j] == 0){
				b[j] = 1;
				start++;
				if(last == -1){
					last = j;
					continue;
				}
				next[last] = j;
				last = j;
		   }	
		}
		else{
			break;
		}
	}
		for(j=0;j<bs;j++){
			printf("\t%d",next[j]);
		}
			
}
