class ReverseWordsInAString {
    public String reverseWords(String s) {
        s = s.trim();
        int len = s.length();
        int left = len - 1;
        int right = len - 1;
        String reverse = "";
        while (left >= 0) {
            if (Character.isSpace(s.charAt(left))) {
                left--;
                continue;
            }
            if (left < len-1 && Character.isSpace(s.charAt(left + 1))) {
                right = left;
            }
            if (left == 0 || s.charAt(left - 1) == ' ') {
                int index = left;
                while (index <= right) {
                    reverse += s.charAt(index);
                    index++;
                }
                if (left != 0) {
                    reverse = reverse + " ";
                }
            }
            left--;
        }
        return reverse;

    }
}
