class BinaryTreeManualInput {
    int data;
    BinaryTreeManualInput left;
    BinaryTreeManualInput right;
    BinaryTreeManualInput(int data) {
        this.data = data;
    }
    public static void main(String[] args) {
        BinaryTreeManualInput root = new BinaryTreeManualInput(10);
        root.left = new BinaryTreeManualInput(20);
        root.right = new BinaryTreeManualInput(30);
        root.left.left = new BinaryTreeManualInput(40);
        root.left.right = new BinaryTreeManualInput(50);
        root.right.left = new BinaryTreeManualInput(60);
        root.right.right = new BinaryTreeManualInput(70);
        System.out.print("      "+root.data);
        System.out.println();
        System.out.print("  "+root.left.data+"   ");
        System.out.print("  "+root.right.data+"   ");
        System.out.println();
        System.out.print(root.left.left.data+" ");
        System.out.print(root.left.right.data+" ");
        System.out.print("  "+root.right.left.data+" ");
        System.out.print(""+root.right.right.data);
    }
}
