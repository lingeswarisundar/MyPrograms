class FindTheKbeautyOfANumber {
    public int divisorSubstrings(int num, int k) {
        String numStr = Integer.toString(num);
        int count = 0;
        int len = numStr.length();
        if(len==1){
           return 1;
        }
        for(int i=0;i<=len-k;i++){
            int div = Integer.valueOf(numStr.substring(i,i+k));
            if(div==0){
                continue;
            }
            if(num%div==0){
                count++;
            }
        }
        return count;
    }
}
