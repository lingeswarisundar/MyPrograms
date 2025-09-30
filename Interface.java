interface Shape {
    public void computeArea(int a[]);
    public void printArea();
}

class Rectangle implements Shape {
    int area;
    public void computeArea (int a[]) {
        area = a[0]*a[1];
    }
    public void printArea() {
        System.out.println("Area of the Rectangle :"+area);
    }
}

class Square implements Shape {
    int area;
    public void computeArea (int a[]) {
        area = a[0]*a[0];
    }
    public void printArea() {
        System.out.println("Area of the Square :"+area);
    }
}

class Circle implements Shape {
    float area;
    public void computeArea (int a[]) {
        area = a[0]*a[0]*3.14F;
    }
    public void printArea() {
        System.out.println("Area of the Circle is :"+area);
    }
}

class Interface {
    public static void main(String[] args) {
        int recDimen[] = {4,5};
        Rectangle r = new Rectangle();
        r.computeArea(recDimen);
        r.printArea();
        int squDimen[] = {6};
        Square s = new Square();
        s.computeArea(squDimen);
        s.printArea();
        int cirDimen[] = {7};
        Circle c = new Circle();
        c.computeArea(cirDimen);
        c.printArea();
    }
}
