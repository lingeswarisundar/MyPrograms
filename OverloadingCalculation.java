public class OverloadingCalculation {
    int minFunction(int n1, int n2, int n3) {
        int min;
        int temp = n1<n2? n1 : n2;
        min = n3 < temp? n3 : temp;
        return min;
    }
    
    double minFunction(double n1, double n2) {
        double min;
        if(n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }
    
    double minFunction(int n1, double n2) {
        double min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }

    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        int c = 3;
        double x = 7.3;
        double y = 9.4;
        OverloadingCalculation oc = new OverloadingCalculation();
        int result1 = oc.minFunction(a, b, c);
        double result2 = oc.minFunction(x, y);
        double result3 = oc.minFunction(a, x);
        System.out.println("Minimum("+a+","+b+","+c+") = " + result1);
        System.out.println("Minimum("+x+","+y+") = " + result2);
        System.out.println("Minimum("+a+","+x+") = " + result3);
    }
}
