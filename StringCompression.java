class StringCompression {
    public int compress(char[] chars) {
        int left = 0;
        int right = 1;
        int index = 0;
        int len = chars.length;
        if (len == 1) {
            return 1;
        }
        while (right <= len) {
            if (right == len || chars[left] != chars[right]) {
                int count = right - left;
                chars[index] = chars[left];
                if (count >= 10) {
                    String digit = "" + count;
                    for (int i = 0; i < digit.length(); i++) {
                        index++;
                        chars[index] = digit.charAt(i);
                    }
                    index++;
                } else {
                    if (count == 1) {
                        index++;
                    } else {
                        chars[index + 1] = (char) (count + '0');
                        index += 2;
                    }
                }
                left = right;
            }
            right++;
        }
        return index;
    }

}
