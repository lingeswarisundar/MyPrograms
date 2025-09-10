class Add {
    int num1,num2,sum;
    static Add calculateSum(Add a1,Add a2) {
        Add a3=new Add();
        a3.num1=a1.num1+a1.num2;
        a3.num2=a2.num1+a2.num2;
        a3.sum=a3.num1+a3.num2;
        return a3;
    }
    public static void main(String arg[]) {
        Add ob1=new Add();
        ob1.num1=10;
        ob1.num2=15;
        Add ob2=new Add();
        ob2.num1=100;
        ob2.num2=150;
        Add ob3=calculateSum(ob1,ob2);
        System.out.println("Object 1 -> Sum = "+ob1.sum);
        System.out.println("Object 2 -> Sum = "+ob2.sum);
        System.out.println("Object 3 -> Sum = "+ob3.sum);
    }
}
