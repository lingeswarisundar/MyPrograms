class BestBuyAndSellStock {
    public static void main(String[] args){
        int [] arr = {4,2,1,6,7};
        int buy = 0;
        int n = arr.length;
        for(int i = 1;i<n;i++) {
            if(arr[buy]>arr[i]) {
                buy = i;
            }
        }
        System.out.println("Best time to buy on "+(buy+1)+" day.");
        int sell = buy;
        for(int i = sell+1;i<n;i++) {
            if(arr[i]>arr[sell]) {
                sell = i;
            }
        }
        if(sell==buy) {
           System.out.println("There is no Best time sell."); 
        } else {
            System.out.println("Best time for sell on "+(sell+1)+" day.");
        }
    }
}
