class SingleNumberFindingByXOR {
    public static void main(String[] args){
        int []arr = {4,2,1,2,1};
        int result = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++) {
            result = result^arr[i];
        }
        System.out.println("Unique number is "+result);
    }
}
