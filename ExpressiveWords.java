class ExpressiveWords {
    public int expressiveWords(String s, String[] words) {
        int count = 0;
        int stretchCount = 0;
        char[] letter = new char[100];
        int[] letterCount = new int[100];
        int letterLength = 0;
        for(int i = 0;i < s.length();i++) {
            count++;
            if(i == s.length()-1 || s.charAt(i) != s.charAt(i+1)) {
                letter[letterLength] = s.charAt(i);
                letterCount[letterLength] = count;
                letterLength++;
                count = 0;
            }
        }
        for(int i = 0; i < words.length; i++) {
            boolean stretchy = false;
            int wordLength = words[i].length();
            if(wordLength < letterLength) {
                continue;
            }
            int index = 0;
            for(int j =0;j < wordLength;j++) {
                if(count == 0) {
                    if(letter[index]!=words[i].charAt(j)) {
                        stretchy = false;
                        break;
                    }
                }
                count++;
                if(j == wordLength-1 || words[i].charAt(j)!=words[i].charAt(j+1)) {
                    int temp = count;
                    count = 0;
                    if(temp < letterCount[index]) {
                        if(letterCount[index] >= 3) {
                            stretchy = true;
                        } else {
                            stretchy = false;
                            break;
                        }
                    } else if (temp > letterCount[index]) {
                        stretchy = false;
                        break;
                    }
                    index++;
                }
            }
            if(stretchy == true) {
                stretchCount++;
            }            
        }
        return stretchCount;
    }
}
