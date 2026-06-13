class FriendsOfAppropriateAges {
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        System.out.print(Arrays.toString(ages));
        int len = ages.length;
        int req = 0;
        int index = 0;
        while (index < len) {
            int left = index - 1;
            int right = index + 1;
            while(left > -1) {
                if (ages[left] <= 0.5 * ages[index] + 7 ) {
                    break;
                }
                req++;
                left--;
            }
            while (right < len) {
                if (ages[index] <= 0.5 * ages[right] + 7 || ages[right] > ages[index] || ages[right] > 100 && ages[index] < 100 ) {
                    break;
                }
                req++;
                right++;
            }
            index++;
        }
        return req;
    }
}
