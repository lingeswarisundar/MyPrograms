class PascalsTriangle {
    public static void main(String[] args) {
        int n = 10;
        int [][] array = new int [10][10];
        for(int i = 0;i<n;i++) {
            for(int j=0;j<=i;j++){
                if(j==0||j==i) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i-1][j-1]+array[i-1][j];
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
