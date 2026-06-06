class CamelcaseMatching {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        ArrayList<Boolean> result = new ArrayList<>();
        int patternLen = pattern.length();
        for(String query : queries) {
            int left = 0;
            int right = 0;
            int noUpper = 0;
            int queryLen = query.length();
            while(left < queryLen) {
                if(right < patternLen && query.charAt(left)==pattern.charAt(right)) {
                    right++;
                    left++;
                    continue;
                }
                if(Character.isUpperCase(query.charAt(left))) {
                    noUpper = 1;
                    break;
                }
                left++;
            }
            if(noUpper == 0 && right==patternLen) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
