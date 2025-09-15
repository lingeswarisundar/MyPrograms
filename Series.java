import java.util.Scanner;

class Series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int n = 0;
        int t = 1;
        while(t!=0) {
            a = in.nextInt();
            b = in.nextInt();   
            n = in.nextInt();
            if(a<=50&&a>=0&&b<=50&&b>=0&&n<=15&&n>=1) {
                t = 0;
            }
        }
        int[] sum = new int[n];
         sum[0] = a+1*b;
        for(int i=1;i<n;i++){
            sum[i] = sum[i-1] + (int)Math.pow(2,i)*b;
        }
        for(int i=0;i<n;i++){
            System.out.print(sum[i]+" ");
        }
        in.close();
    }
}

