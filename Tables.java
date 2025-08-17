import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Tables {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter a Number");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter your limit");
        int i=Integer.parseInt(br.readLine());
        for(int j=1;j<=i;j++){
            int tab=a*j;
            System.out.println(a+"×"+j+"="+tab);
        }
    
    }
}
