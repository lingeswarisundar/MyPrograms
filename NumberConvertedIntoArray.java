import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class NumberConvertedIntoArray {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int[]arr=new int[5];
        System.out.println("Enter 5 digit number");
        int num=Integer.parseInt(br.readLine());
        int i=4;
        while(num!=0){
            arr[i]=num%10;
            num=num/10;
            if(i<5){
                i--;
            }
        }    
        for(int j =0;j<=4;j++){
             System.out.print(arr[j]+" ");
        }
    }  
}
