class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;
    BinaryTree (int data){
        this.data = data;
    }
}
class FindEdgeHeight {
    static BinaryTree insert(int data,BinaryTree root) {
        if(root==null) {
            root = new BinaryTree(data);
        } else if(data < root.data){
            root.left = insert(data,root.left);
        } else {
            root.right = insert(data,root.right);
        }
        return root;
    }
    static void inorder(BinaryTree root) {
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    static public int height(BinaryTree root) {
        if (root == null) {
            return -1;  // or 0 depending on definition
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {
        BinaryTree ro = null;
        BinaryTree root = insert(50,ro);
        insert(40,root);
        insert(60,root);
        insert(30,root);
        insert(45,root);
        insert(55,root);
        insert(70,root);
        insert(51,root);
        System.out.println("\tBinarySearchTree");
        System.out.print("Inorder ");
        inorder(root);
        System.out.println("\nEdge Heigth of the tree is "+height(root));
    }
}
