class FibanociSeriesUsingRecursion {
    static void fibanociSeries(int n,int a,int b){
        if(n>0) {
            int c = a+b;
            System.out.print(" "+c);
            fibanociSeries(n-1,b,c);
        }
    }
    public static void main(String[] args) {
        int n = 5; 
        System.out.print("0 1 1");
        fibanociSeries(n-3,1,1);
    }
}
