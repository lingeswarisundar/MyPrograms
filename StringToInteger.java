class StringToInteger{
    public int myAtoi(String s) {
        int left = 0;
        long result = 0;
        String str = s.trim();
        int len = str.length();
        int sign = 1;
        if(left<len && str.charAt(left)=='-') {
            sign = -1;
            left++;
        } else if(left<len &&str.charAt(left)=='+') {
            left++;
        }
        while(left<len&& str.charAt(left)=='0') {
            left++;
        }
        while(left<len && Character.isDigit(str.charAt(left))) {
            result = result*10 + (str.charAt(left)-'0');
            left++;
            if(result*sign<=Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if(result*sign>=Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
        }
        return (int) (result*sign);
    }
}
