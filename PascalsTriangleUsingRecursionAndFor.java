class PascalsTriangleUsingRecursionAndFor {
    static void pascalsTriangle(int n,int size,int arr[]){
        int[] temp = new int[100];
        if(n<=size) {
            for(int i=0;i<n;i++){
                if(i==0||i==n-1) {
                  temp[i] = 1; 
                } else {
                   temp[i] = arr[i-1] + arr[i];
                }
                System.out.print(temp[i]+" ");
            }
            System.out.println();
            pascalsTriangle(n+1,size,temp);
        }    
    }
    public static void main (String[] args) {
        int size = 10;
        int [] arr = new int[100];
        pascalsTriangle(1,size,arr);
    }
}
