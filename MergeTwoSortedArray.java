class MergeTwoSortedArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,4};
        int [] arr2 = {3,5,6,7,8};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int len = n1+n2;
        int [] merge = new int[len];
        int i = 0;
        int j = 0;
        for(int k=0;k<len;k++) {
            if(j==n2||i<n1&&arr1[i]<arr2[j]){
                merge[k] = arr1[i];
                i++;
            } else {
                merge[k] = arr2[j];
                j++;
            }
        }
        System.out.print("Two Sored Merge Array :");
        for(int k=0;k<len;k++) {
            System.out.print(merge[k]+" ");
        }
    }
}
