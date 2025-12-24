class BinaryTree {
    Object data;
    BinaryTree left;
    BinaryTree right;
    BinaryTree(Object data) {
        this.data = data;
    }
}
class FindRoot {
    static Object find;
    static Object find(BinaryTree root,Object data) {
        leftTraversal(root,data);
        rightTraversal(root,data);
        return find;
    }
    static void rightTraversal(BinaryTree root,Object data) {
        if(root.right!=null) {
            if(root.right.data==data) {
                find = root.data;
            }
            rightTraversal(root.right,data);
            leftTraversal(root.right,data);
            
        } 
    }
    static void leftTraversal(BinaryTree root,Object data) {
        if(root.left!=null) {
            if(root.left.data==data) {
                find = root.data;   
            }
            leftTraversal(root.left,data);
            rightTraversal(root.left,data);
        } 
    }
    
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(10);
        root.left = new BinaryTree(20);
        root.right = new BinaryTree(30);
        root.left.left = new BinaryTree(40);
        root.left.right = new BinaryTree(50);
        root.right.left = new BinaryTree(60);
        root.right.right = new BinaryTree(70);
        root.right.right.right = new BinaryTree(80);
        root.right.right.right.left = new BinaryTree(90);
        find(root,10);
        if(find==null) {
           System.out.println("Element not having root"); 
        } else {
           System.out.println("Root is "+find);
        }
    }
}
    

