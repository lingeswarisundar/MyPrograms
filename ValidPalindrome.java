class ValidPalindrome {
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(str.charAt(left))){
                left++;
            } else if(!Character.isLetterOrDigit(str.charAt(right))){
                right--;
            } else if (Character.toLowerCase(str.charAt(left))==Character.toLowerCase(str.charAt (right))){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;            
    }
}
