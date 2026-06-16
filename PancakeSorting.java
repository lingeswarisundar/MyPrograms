class PancakeSorting {
    private void swap(int left,int right,int arr[]) {
        while(left<right){
            int temp= arr[left];
            arr[left]= arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> lt = new ArrayList<>();
        int len = arr.length;
        int right = len-1;
        while(right>0){
            int largeIndex = 0;
            for(int i=1;i<=right;i++){
                if(arr[largeIndex]<arr[i]){
                    largeIndex = i;
                }
            }
            if(largeIndex!=right) {
                lt.add(largeIndex+1);
                swap(0,largeIndex,arr);
                lt.add(right+1);
                swap(0,right,arr);
            }
            right--;
        }
        return lt;
    }
}
