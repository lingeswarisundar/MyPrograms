class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int len = arr.length;
        int [] diff = new int[len];
        int min = 0;
        for(int i=0;i<len;i++) {
            diff[i] = Math.abs(arr[i] - x);
            if(i>0 && diff[i] < diff[min]) {
                min = i;
            }
        }
        if(k==1) {
            list.add(arr[min]);
            return list;
        }
        int left = min;
        int right = min;
        int count = 1; 
        while(count < k) {
            if(left-1 == -1) {
                right++;
                count++;
                continue;
            }
            if(right+1 == len) {
                left--;
                count++;
                continue;
            }            
            if(left>0 && right<len-1 && diff[left-1] <= diff[right+1]) {
                left--;
                count++;
            } else {
                right++;
                count++;
            }
        } 
        for(int i = left;i<=right;i++) {
            list.add(arr[i]);
        } 
        return list;
    }
}
