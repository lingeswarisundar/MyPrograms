import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class TwoSum {
    public static void main(String args[])throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int [] arr = {2,3,6,5,1};
        int n = 5;
        System.out.print("Enter your target num: ");
        int target = Integer.parseInt(br.readLine());
        for(int i=0;i<n-1;i++) {
            for(int j=1;j<n;j++) {
                if(arr[i]+arr[j]==target){
                    System.out.print("[ "+arr[i]+" "+arr[j]+" ]");
                }
            }
        }
    }
}
