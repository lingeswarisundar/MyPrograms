class Queue {
    static Queue front;
    static Queue rear;
    BinaryTree value;
    Queue next;
    Queue(Queue next,BinaryTree value) {
        this.value = value;
        this.next = next;
    }
    Queue() {
    }
    void enqueue(BinaryTree root) {
        if(front==null) {
            front = new Queue(front,root);
            rear = front;
        } else {
            rear.next = new Queue(rear.next,root);
            rear = rear.next;
        }  
    }
    BinaryTree dequeue(){
        Queue fr = front;
        front = front.next;
        return fr.value;
    }
    boolean isEmpty() {
        if(front==null) {
            return true;
        }
        return false;
    }
}
class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;
    BinaryTree(int data) {
        this.data = data;
    }
    BinaryTree breadthFirstSearch(int val) {
        Queue q = new Queue();
        q.enqueue(this);
        while(!q.isEmpty()) {
            BinaryTree node = q.dequeue();
            if(node.data==val){
                return node;
            }
            if(node.left!=null) {
                q.enqueue(node.left);
            }
            if(node.right!=null) {
                q.enqueue(node.right);
            }
        }
        return null;    
    }
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(10);
        root.left = new BinaryTree(20);
        root.right = new BinaryTree(30);
        root.left.left = new BinaryTree(40);
        root.left.right = new BinaryTree(50);
        root.left.left.right = new BinaryTree(45);
        BinaryTree node = root.breadthFirstSearch(45);
        if(node==null) {
            System.out.print("Element is not in the tree");
        } else {
            System.out.println("Element is in the tree");
        }
    }
}

