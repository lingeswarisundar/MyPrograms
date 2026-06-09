class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        List<Integer> lt = new ArrayList<>();
        HashMap<Character,Integer> hm = new HashMap<>();
        int start = 0;
        int max = 0;
        int left = 0;
        int right = 0;
        int[] alpha = new int[26];
        for(int i=0;i<s.length();i++) {
            int alphaVal = s.charAt(i)-97;
            alpha[alphaVal] = i;
        }
        while(left < s.length()) {
            right = alpha[s.charAt(left)-97];
            max = Math.max(max,right);
            if(left==max) {
                lt.add(max+1-start);
                start = max+1;
            }
            left++;
        }
        return lt;
    }
}
