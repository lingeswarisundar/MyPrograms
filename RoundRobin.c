#include <stdio.h>
int main() {
    int n,i,j;
    printf("Enter number of processes : ");
    scanf("%d",&n);
    int bt[n], wt[n], rem[n], tat[n];
    float avg_wt = 0;
    float avg_tat = 0;
    printf("Enter Burst time for each process:\n");
    for(i=0;i<n;i++){
        printf("P%d : ",i+1);
        scanf("%d",&bt[i]);
        rem[i] = bt[i];
    }
    int finish = 0;
    int time = 0;
    int quantum = 2;
    while(finish<n) {
        for(i = 0; i < n; i++) {
            if(rem[i]>quantum) {
                rem[i] = rem[i] - 2;
                time = time + 2;
                
            } else if (rem[i]!=0) {
                time = time + rem[i];
                tat[i] = time;
                wt[i] = tat[i] - bt[i]; 
                rem[i] = 0;
                finish++;
            }
        } 
    }
    for(i=0;i<n;i++){
        avg_wt += wt[i];
        avg_tat += tat[i];
    }
    avg_wt = avg_wt/n;
    avg_tat = avg_tat/n;
    printf("\nBurst Time\tWaiting Time\tTurnAround Time\n");
    for(i=0;i<n;i++) {
        printf("%d\t\t%d\t\t%d\n",bt[i],wt[i],tat[i]);
    }
    printf("\nAverage Waiting Time = %.2f",avg_wt);
    printf("\nAverage TurnAround Time = %.2f",avg_tat);
    printf("\nGantt Chart : \n|");
    for(i = 0; i < n; i++) {
        printf("P%d |",i+1);
    }
    printf("\n");
    for(i = 0; i < n; i++){
        printf("%d  ",tat[i]);  
    }
    printf("\n");
    return 0;
}
