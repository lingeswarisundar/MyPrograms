class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
       int len = code.length;
       int index = 0;
       int[] decrypt = new int[len];
        if(k==0) {
            return decrypt;
        }
        for(int i=0;i<len;i++) {
            if(k<0){
                index = i + len + k;
            } else {
                index = i+1;
            }
            int end = index+Math.abs(k);
        while(index<end)  {  decrypt[i]+=code[index%len]; 
                index++;
            }
        }
        return decrypt;
    }
}
