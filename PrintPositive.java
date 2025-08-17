import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class PrintPositive {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter your limit:");
        int a=Integer.parseInt(br.readLine());
        int[]arr=new int[a];
        for(int i=0;i<a;i++){
            int num=Integer.parseInt(br.readLine());
            arr[i]=num;
        }
        System.out.print("Positive numbers are ");
        for(int i=0;i<a;i++){
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
            }
        }
    }   
}
