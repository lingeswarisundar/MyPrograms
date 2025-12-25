class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;
    BinaryTree(int data) {
        this.data = data;
    }
}
class Node {
    BinaryTree value;
    Node next;
    Node(Node next,BinaryTree value) {
        this.value = value;
        this.next = next;
    }
}
class BreadthFirstTraversal {
    static Node front;
    static Node rear;
    static Node enqueue(BinaryTree root) {
        if(front==null) {
            front = new Node(front,root);
            rear = front;
        } else {
            rear.next = new Node(rear.next,root);
            rear = rear.next;
        }
        return front;  
    }
    static void dequeue(){
        front = front.next;
    }
    static void breadthFirstTraversal() {
        if(front!=null) {
            if(front.value.left!=null) {
                enqueue(front.value.left);
            }
            if(front.value.right!=null) {
                enqueue(front.value.right);
            }
            System.out.print(front.value.data+" ");
            dequeue();
            breadthFirstTraversal();
        }
    }
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(10);
        root.left = new BinaryTree(20);
        root.right = new BinaryTree(30);
        root.left.left = new BinaryTree(40);
        root.left.right = new BinaryTree(50);
        root.left.left.right = new BinaryTree(45);
        enqueue(root);
        breadthFirstTraversal();
    }
}

