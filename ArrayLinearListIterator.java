import java.util.Iterator;
import java.util.NoSuchElementException;
class ArrayLinearList {
    Object [] element;
    int size;
    ArrayLinearList (int n) {
        element = new Object[n]; 
    }
    public void add(int index, Object theElement) {
        for(int i =size-1;i>=index;i--) {
            element[i+1] = element[i];
        }
        element[index] = theElement;
        size++;
    }
    public Iterator iterator() {
        return new ArrayLinearListIterator(this);
    }
}
class ArrayLinearListIterator implements Iterator {
    private ArrayLinearList list;
    private int nextIndex;
    public ArrayLinearListIterator(ArrayLinearList theList) {
        list = theList;
        nextIndex = 0;
    }
    public boolean hasNext() {
        return nextIndex<list.size;
    }
    public Object next() {
        if(nextIndex<list.size) {
            return list.element[nextIndex++];
        } else  {
            throw new NoSuchElementException("No Next element");
        }
    }
    public void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }
    public static void main (String[] args) {
        ArrayLinearList x = new ArrayLinearList(5);
        x.add(0,new Integer(4));
        x.add(0,new String("a"));
        x.add(0,new Integer(2));
        x.add(0,new Integer(1));
        x.add(0,new Integer(0));
        Iterator y = x.iterator();
        while (y.hasNext()) {
            System.out.print(y.next()+" ");
        }
    }
}   
