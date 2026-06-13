class MostProfitAssigningWork {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int d = difficulty.length;
        int w = worker.length;
        int earn = 0;
        for (int i = 0; i < w; i++) {
            int gain = -1;
            int left = 0;
            int right = d-1;
            while(left<=right) {
                if (difficulty[left] <= worker[i] && gain < profit[left]) {
                    gain = profit[left];
                }
                if (difficulty[right] <= worker[i] && gain < profit[right]) {
                    gain = profit[right];
                }
                left++;
                right--;
            }
            if (gain!=-1) {
                earn += gain;
            }           
        }
        return earn;
    }
}
