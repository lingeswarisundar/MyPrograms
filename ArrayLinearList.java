interface LinearList {
    public boolean isEmpty();
    public int size();
    public int get(int index);
    public int indexOf(int elem);
    public int remove(int index);
    public void add(int index,int obj);
    public String toString(); 
}

public class ArrayLinearList implements LinearList {
    int [] element;
    ArrayLinearList (int n) {
        element = new int[n]; 
    }
    public void changeLength() {
        int newLength = element.length*2;
        int[] newArray = new int[newLength];
        for(int i = 0;i<element.length;i++) {
            newArray[i] = element[i];
        }
        element = newArray;
    }
    int size;
    public boolean isEmpty() {
        return size==0;
    }
    public int size() {
        return size;
    }
    void checkIndex(int index) {
        if(index<0||index>=size) {
            throw new IndexOutOfBoundsException("index = "+index+" size = "+size);
        }
    }
    public int get(int index) {
        checkIndex(index);
        return element[index];
    }
    public int indexOf(int theElement) {
        for(int i = 0; i < size; i++) {
            if(element[i]==theElement) {
                return i;
            }
        }
        return -1;
    }
    public int remove(int index) {
        checkIndex(index);
        int removedElement = element[index];
        for(int i = index+1; i<size ;i++) {
            element[i-1] = element[i];
        }
        return removedElement;
    }
    public void add(int index, int theElement) {
        if(index==size) {
            changeLength();
        }
        for(int i =size-1;i>=index;i--) {
            element[i+1] = element[i];
        }
        element[index] = theElement;
        size++;
    }
    public String toString() {
        StringBuffer s = new StringBuffer("[ ");
        for(int i = 0;i<size;i++) {
            s.append(element[i]+" ");
        }
        s.append("]");
        return new String(s);
    }
    public static void main(String[] args){
        LinearList l = new ArrayLinearList(2);
        l.add(0,1);
        l.add(1,2);
        l.add(2,1);
        String s = l.toString();
        System.out.print(s);
    }
}
