interface LinearList {
    public void add(Object firstNode);
    public Object remove(int index);
    public void print();
}

class Node {
    Object element;
    Node next;
    Node (Object element,Node next){
        this.element = element;
        this.next = next;
    }
}

class LinkedListWithInterface implements LinearList {
    Node head;
    Node tail;
    int size;
    public void add(Object element){
        if(head==null){
            head = new Node(element,head);
            tail = head;
        } else {
            tail.next = new Node(element,tail.next);
            tail = tail.next;
        }
        size++;
    }
    public Object remove(int index){
        Object removedElement;
        Node p = head;
        if(index==0){
            removedElement = head;
            head = head.next;
        } else {
            for(int i = 1;i<index;i++){
                p = p.next;
            }
            removedElement = p.next.element;
            p.next = p.next.next; 
        }
        size--;
        return removedElement;
    }
    public void print(){
        Node p = head;
        while(p!=null) {
            System.out.print(p.element+" ");
            p = p.next;
        }
    }
    public static void main(String[] args) {
        LinkedListWithInterface l = new LinkedListWithInterface();
        l.add(2);
        l.add(3);
        l.add(4);
        l.print();
        l.remove(1);
        l.print();
    }
}
