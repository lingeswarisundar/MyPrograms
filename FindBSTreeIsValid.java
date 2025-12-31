class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;
    BinaryTree (int data){
        this.data = data;
    }
}
class FindBSTreeIsValid {
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
    public static boolean isValidBST(BinaryTree root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(BinaryTree root, long minVal, long maxVal) {
        if (root == null) {
            return true;
        }
        
        if (root.data <= minVal || root.data >= maxVal) {
            return false;
        }
        
        return validate(root.left, minVal, root.data) && validate(root.right, root.data, maxVal);
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
        System.out.println("\nThis is a "+isValidBST(root)+" BSTree");
    }
}
