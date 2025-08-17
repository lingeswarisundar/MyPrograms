import java.util.*;
class SumAndAverageOfArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum=0;
        System.out.println("Enter the elements\n");
        for(int i=0;i<n;i++) {
             a[i]=sc.nextInt();
        }     
        for(int i=0;i<n;i++){
            sum+=a[i];
        }    
        System.out.println("Sum="+sum+" Avg="+(sum/n));
    }
}
