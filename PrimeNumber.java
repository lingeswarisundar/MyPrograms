import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class PrimeNumber{
    public static void main(String [] args) throws Exception{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter a number:");
        int num=Integer.parseInt(br.readLine());
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.print(num+" is not prime") ;
                break;
            }
            else {
                 if(num-1==i){
                    System.out.print(num+" is prime");
                 }
            }
        }
    }
}
