public class MultiCatchBlock {
    public static void main(String[] args) {
        try {
            int a[]= {1,5,10,15,16};
            System.out.println("a[1] = "+a[1]);
            System.out.println("a[2]/a[3] = "+a[2]/a[3]);
            System.out.println("a[5] = "+a[5]);
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch(Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
