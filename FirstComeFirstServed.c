#include <stdio.h>
int main() {
    int n,i;
    printf("Enter number of processes : ");
    scanf("%d",&n);
    int bt[n], wt[n], tat[n];
    float avg_wt = 0;
    float avg_tat = 0;
    printf("Enter Burst time for each process:\n");
    for(i=0;i<n;i++){
        printf("P%d : ",i+1);
        scanf("%d",&bt[i]);
    }
    wt[0] = 0;
    for(i = 1; i < n; i++) {
        wt[i] = wt[i-1] + bt[i-1];
    }
    for(i =0;i<n;i++){
        tat[i] = wt[i] + bt[i];
        avg_wt += wt[i];
        avg_tat += tat[i];
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
