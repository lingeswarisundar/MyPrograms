import java.util.*;
public class BinarySearch {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) {
           a[i]=sc.nextInt();
        }   
        Arrays.sort(a);
        System.out.println("Enter the search element :");
        int key=sc.nextInt();
        int low=0,high=n-1,mid,found=0;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==key){ 
               found=1; 
               break;
            }
            else if(key<a[mid]) {
               high=mid-1;
            }   
            else {
               low=mid+1;
            }
        }
        System.out.println(found==1?"Found":"Not Found");
    }
}
