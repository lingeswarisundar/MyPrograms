class ValidParanthesesLeetCode {
    public boolean isValid(String s) {
        int len = s.length();
        char[] para = new char[len];
        int index = 0;
        for(int i=0;i<len;i++) {
            char p = s.charAt(i);
            if(p=='(') {
                para[index] = p;
                index++;
            } else if(p=='[') {
                para[index] = p;
                index++;
            } else if(p=='{') {
                para[index] = p;
                index++;
            } else {
                if(index!=0 && para[index-1]=='(' && p==')') {
                    index--;
                } else if(index!=0 && para[index-1]=='[' && p==']') {
                    index--;
                } else if(index!=0 && para[index-1]=='{' && p=='}') {
                    index--;
                } else {
                    return false;
                }
            }
        }
        if(index==0){
            return true;
        }
        return false;
    }
}
