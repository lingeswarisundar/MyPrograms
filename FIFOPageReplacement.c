#include<stdio.h>
int main() {
    int i,j;
    int rs;
    printf("Enter the size of the reference string : ") ;
    scanf("%d",&rs);
    int ref[rs];
    printf("Enter the reference string : ");
    for(i=0;i<rs;i++) {
        scanf("%d",&ref[i]);
    }
    int fs;
    printf("Enter the frame size : ");
    scanf("%d",&fs);
    int frame[fs];
    for(i=0;i<fs;i++) {
        frame[i] = -1;
    }
    int fault = 0;
    int start = 0;
    printf("FIFO Page Replacement\n");
    for(i=0;i<rs;i++) {
        int found = 0;
        for(j=0;j<fs;j++) {
            if(ref[i]==frame[j]) {
                found = 1;
                break;
            }
        }
        if(found==0) {
            if(start == fs) {
                start = 0;
            }
            frame[start] = ref[i];
            fault++;
            start++;
            for(j=0;j<fs;j++) {
                if(frame[j]==-1) {
                    printf("- ");
                    continue;
                }
                printf("%d ",frame[j]);
            }
            printf("\n");
        }  
    }
    printf("Page Fault : %d",fault);
}
