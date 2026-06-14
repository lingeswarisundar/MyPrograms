class ReverseVowelsInAString {
    public String reverseVowels(String s) {
        char[] str =  s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        boolean lb = false;
        boolean rb = false;
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('a',1);
        hm.put('e',2);
        hm.put('i',3);
        hm.put('o',4);
        hm.put('u',5);
        hm.put('A',6);
        hm.put('E',7);
        hm.put('I',8);
        hm.put('O',9);
        hm.put('U',10);
        while(left<right) {
          if(!hm.containsKey(s.charAt(left))){
             left++;   
            } else {
              lb = true;
          }
        if(!hm.containsKey(s.charAt(right))){
             right--;   
            } else {
              rb = true;
            }
        if(lb==true &&rb==true){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            lb = false;
            rb = false;
            left++;
            right--;
        }
    }
    String rev = new String(str);
    return rev;
    }
}
