#include <stdio.h>
int main() {
    int n,i,j;
    printf("Enter number of processes : ");
    scanf("%d",&n);
    int sjf[n], bt[n], wt[n], tat[n];
    float avg_wt = 0;
    float avg_tat = 0;
    printf("Enter Burst time for each process:\n");
    for(i=0;i<n;i++){
        printf("P%d : ",i+1);
        scanf("%d",&bt[i]);
        sjf[i] = bt[i];
    }
    int pos[n];
    for(i=0;i<n;i++){
        pos[i] = i+1;
    }
    for(i=0;i<n-1;i++) {
        for(j=i+1;j<n;j++){
            if(sjf[i]>sjf[j]) {
                int small1 = sjf[j];
                sjf[j] = sjf[i];
                sjf[i] = small1;
                int small2 = pos[j];
                pos[j] = pos[i];
                pos[i] = small2;
            }
        }
    }
    wt[0] = 0;
    for(i = 1; i < n; i++) {
        wt[i] = wt[i-1] + sjf[i-1];
    }
    for(i =0;i<n;i++){
        tat[i] = wt[i] + sjf[i];
        avg_wt += wt[i];
        avg_tat += tat[i];
    }
    for(i=0;i<n-1;i++) {
        for(j=i+1;j<n;j++){
            if(pos[i]>pos[j]) {
                int small1 = pos[j];
                pos[j] = pos[i];
                pos[i] = small1;
                int small2 = wt[j];
                wt[j] = wt[i];
                wt[i] = small2;
                int small3 = tat[j];
                tat[j] = tat[i];
                tat[i] = small3;
            }
        }
    }
    avg_wt = avg_wt/n;
    avg_tat = avg_tat/n;
    printf("\nProcess\tBurst Time\tWaiting Time\tTurnAround Time\n");
    for(i=0;i<n;i++) {
        printf("P%d\t%d\t\t%d\t\t%d\n",i+1,bt[i],wt[i],tat[i]);
    }
    printf("\nAverage Waiting Time = %.2f",avg_wt);
    printf("\nAverage TurnAround Time = %.2f",avg_tat);
    printf("\nGantt Chart : \n|");
    for(i=0;i<n;i++) {
        printf("P%d |",i+1);
    }
    printf("\n");
    for(i=0;i<n;i++){
        printf("%d  ",tat[i]);  
    }
    printf("\n");
    return 0;
}
