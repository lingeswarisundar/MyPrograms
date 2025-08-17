import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class ReverseNumberInArray{
    public static void main (String[]args) throws IOException{
	    InputStreamReader isr = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader (isr);
        int[] arr = { 3, 2, 6, 4, 5 };
        System.out.print("OriginalArray:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
	    int j=4;
	    int num=0;
	    for(int i=0; i<arr.length/2;i++){
	        num =arr[i];
	        arr[i]=arr[j];
	        arr[j]=num;
	        j--;
	    }
	    System.out.println ("ReversedArray:");
	    for(int i=0;i<arr.length;i++){
	       System.out.print(" "+arr[i]);
        }
    }
}

