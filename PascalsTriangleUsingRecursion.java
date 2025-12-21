class PascalsTriangleUsingRecursion {
    static int [][] array = new int [10][10];
    static int len;
    static  void pascalsTriangle(int i,int j,int size) {
        if(i<=j) {
            if(i==0||i==j) {
                array[j][i] = 1;
            } else {
                array[j][i] = array[j-1][i-1]+array[j-1][i];
            }
            System.out.print(array[j][i]+" ");
            pascalsTriangle(i+1,j,size);
        } else {
            if(j<size-1) {
                System.out.println();
                pascalsTriangle(0,j+1,size);  
            }
        }
    }
    public static void main(String[] args) {
        pascalsTriangle(0,0,10);   
    }
}
