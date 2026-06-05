class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int max = 0;
        int area = 1;
        while (left < right) {
            if (height[left] < height[right]) {
                area = height[left] * (right - left);
                left++;
            } else {
                area = height[right] * (right - left);
                right--;
            }
            if (max < area) {
                max = area;
            }
        }
        return max;
    }
}
