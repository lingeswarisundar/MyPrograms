class BinaryTree {
    BinaryTree left;
    int data;
    BinaryTree right;
    BinaryTree(int data) {
        this.data = data;
    }
}
class DepthFirstSearch {
    static boolean find(BinaryTree root,int val){
        return recFind(root,val);
    }
    static boolean recFind(BinaryTree root,int val){
        if(root==null) {
            return false;
        }
        if(root.data==val) {
            return true;
        }
        boolean result = find(root.left,val);
        if(result==true) {
            return true;
        }
        return recFind(root.right,val);
    }
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(10);
        root.left = new BinaryTree(20);
        root.right = new BinaryTree(30);
        root.left.left = new BinaryTree(40);
        root.left.right = new BinaryTree(50);
        root.right.left = new BinaryTree(60);
        root.right.right = new BinaryTree(70);
        System.out.print(find(root,100));
    }
}

