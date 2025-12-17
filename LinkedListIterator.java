import java.util.Iterator;
import java.util.NoSuchElementException;
class LinkedList {
    Object element;
    LinkedList next;
    LinkedList (Object element,LinkedList next){
        this.element = element;
        this.next = next;
    } 
}    

class LinkedListIterator implements Iterator {
    LinkedList head;
    LinkedList list;
    int index;
    int size;
    public void add(int in,Object element){
        if(in<0||in>size) {
            throw new IndexOutOfBoundsException("index="+index+"size="+size);
        }
        if(in==0){
            head = new LinkedList(element,head);
            list = head;
        } else {
            LinkedList p = head;
            for(int i = 0;i<in-1;i++){
                p = p.next;
            }
            p.next = new LinkedList(element,p.next);
        }
        size++;
    }
    public boolean hasNext(){
        return index<size;
    }
    public Object next() {
        if(index<size) {
            index++;
            Object ele = list.element;
            list = list.next;
            return ele;
        } else  {
            throw new NoSuchElementException("No Next element");
        }
    }
    public void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }
    public static void main(String[] args) {
        LinkedListIterator l = new LinkedListIterator();
        l.add(0,2);
        l.add(0,3);
        l.add(2,4);
        while(l.hasNext()) {
            System.out.print(l.next());   
        } 
    }
}     

