class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;
    BinaryTree (int data){
        this.data = data;
    }
}
class BinaryTreeDeletion {
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
    static BinaryTree delete(BinaryTree root, int key) {
        if (root == null) {
            return null;
        }
        // Find the node to delete
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Found the node to delete
            
            // Case 1: Leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            
            // Case 2: One child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // Case 3: Two children
            // Find inorder successor (smallest in right subtree)
            BinaryTree successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }
    static BinaryTree findMin(BinaryTree node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
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
        delete(root,50);
        System.out.println();
        inorder(root);
    }
}
