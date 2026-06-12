class ReverseInteger {
    public int reverse(int x) {
        long reverse = 0;
        int sign = 1;
        int num = x;
        if(x < 0) {
            sign = -1;
            num = -1 * num;
        }
        while(num > 0) {
             reverse = reverse*10 + num%10;
             num = num/10;
             if(reverse*sign<=Integer.MIN_VALUE || reverse*sign>=Integer.MAX_VALUE) {
                return 0;
             }
        }
        return (int)reverse*sign;
    }
}
