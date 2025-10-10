class NestedException {
    public static void main(String[] args) {
        try {
            int arr[]={1,5,4,10};
            try {
                int x=arr[3]/arr[1];
                System.out.println("Quotient = "+x);
            } catch(ArithmeticException ae) {
                System.out.println("Divide by zero");
            }
                arr[4]=3;
        } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bound exception");
        }
        System.out.println("...End of Program...");
    }
}
