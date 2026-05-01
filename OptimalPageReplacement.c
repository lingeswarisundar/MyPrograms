#include<stdio.h>
int main() {
    int i,j,k;
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
    int time[fs];
    for(i=0;i<fs;i++) {
        frame[i] = -1;
        time[i] = 1000;
    }
    int fault = 0;
    int start = 0;
    printf("Optimal Page Replacement\n");
    for(i=0;i<rs;i++) {
        int found = 0;
        for(j=0;j<fs;j++) {
            if(ref[i]==frame[j]) {
                found = 1;
                break;
            }
        }
        if(found==0) {
            if(start < fs) {
                frame[start] = ref[i];
                start++;
            } else {
                for(j=0;j<fs;j++) {
                    int found = 0;
                    for(k = rs;k>i;k--) {
                        if(frame[j]==ref[k]) { 
                            found = 1;
                            time[j] = k;
                            break;
                        }
                    }
                    if(found==0) {
                        time[j] = 1000;
                    }
                }
                int large = time[0];
                int index = 0;
                for(j=1;j<fs;j++) {
                    if(large<time[j]) {
                        large = time[j];
                        index = j;
                    }   
                }
                frame[index] = ref[i];
                time[index] = i;
            }
            fault++;
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
