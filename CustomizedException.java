class EvenNoException extends Exception {
    EvenNoException(String str) {
        super(str); // used to refer the superclass constructor
    }
}
class CustomizedException {    
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int rem;
        int i;
        for(i=0;i<arr.length;i++) {
            rem=arr[i]%2;
            try {
                if(rem==0) {
                    System.out.println(arr[i]+" is an EvenNumber");
               } else {
                    EvenNoException exp=new EvenNoException(arr[i]+" is not an Even Number");
                    throw exp;
               }
            } catch(EvenNoException exp) {
                    System.out.println("Exception thrown is "+exp);
            }
        }
    }
}
