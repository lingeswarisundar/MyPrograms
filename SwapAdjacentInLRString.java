class SwapAdjacentInLRString {
    public boolean canTransform(String start, String result) {
        int len = start.length();
        int left = 0;
        int right = 0;
        while(left<len && right < len) {
            if(start.charAt(left)=='X'){
                left++;
                continue;
            }
            if(result.charAt(right)=='X'){
                right++;
                continue;
            }
            if(start.charAt(left)==result.charAt(right)){
                if(start.charAt(left)=='R'&&left>right) {
                    return false;
                }
                if(start.charAt(left)=='L'&&left<right) {
                    return false;
                }
                left++;                                
                right++;
            } else {
                return false;
            }           
        }
        while(left<len) {
            if(start.charAt(left)!='X') {
                return false;
            }
            left++;
        }
        while(right<len) {
            if(result.charAt(right)!='X') {
                return false;
            }
            right++;
        }
        return true;   
    }
}
