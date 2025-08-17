import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class LargestNumberInArray{
    public static void main (String[]args) throws IOException{
	    InputStreamReader isr = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader (isr);
        int[] arr = { 3, 2, 3, 4, 5 };
	    int large=0;
	    int big=1;
	    for (int a = 0; a < arr.length; a++){
		    for (int b = 0; b < arr.length; b++){
		        if (a != b){
			        if(arr[a]>arr[b]){
			            if(large>arr[a]){
				           break;
			            }
			            else{
				          large = arr[a];
			            }
			        }
		        }
		    }
	    }
      	System.out.print ("Largest number is "+large);
    }
}


