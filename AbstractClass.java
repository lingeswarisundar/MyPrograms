abstract class Shape {
    abstract void computeArea(int a[]);
    abstract void printArea();
}

class Rectangle extends Shape {
    int area;
    void computeArea (int a[]) {
        area = a[0]*a[1];
    }
    void printArea() {
        System.out.println("Area of the Rectangle :"+area);
    }
}

class Square extends Shape {
    int area;
    void computeArea (int a[]) {
        area = a[0]*a[0];
    }
    void printArea() {
        System.out.println("Area of the Square :"+area);
    }
}

class Circle extends Shape {
    float area;
    void computeArea (int a[]) {
        area = a[0]*a[0]*3.14F;
    }
    void printArea() {
        System.out.println("Area of the Circle is :"+area);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        int recDimen[] = {4,5};
        Rectangle r = new Rectangle();
        r.computeArea(recDimen);
        r.printArea();
        int squDimen[] = {6};
        Square s = new Square();
        s.computeArea(squDimen);
        s.printArea();
        int cirDimen[] = {6};
        Circle c = new Circle();
        c.computeArea(cirDimen);
        c.printArea();
    }
}
