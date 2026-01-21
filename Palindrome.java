import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Palindrome {
    public static void main (String[] args)throws IOException {
        String palin = "1221";
        int len = palin.length()-1;
        int flag = 1;
        for(int i=0;i<len/2;i++) {
            if(palin.charAt(i)!=palin.charAt(len-i)) {
                System.out.print("This is not palindrome...");
                flag = 0;
            }    
        }
        if(flag==1) {
            System.out.print("This is palindrome...");
        }
    }
}
