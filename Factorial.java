import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Factorial{
    public static void main (String[]args) throws IOException{
	    InputStreamReader isr = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader (isr);
	    System.out.print("Enter number:");
	    int num=Integer.parseInt (br.readLine ());
	    int no=num;
	    int fact=1;
	    while(no!=0){
	        fact=fact*no;
	        no--;
	    }
	    System.out.println ("Factorial of"+num+" = "+fact);
    }
}    
	
