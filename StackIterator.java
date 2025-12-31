import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackIterator<T> implements Iterator<T> {

    private BrowserLinkedList<T>.Node current;

    public StackIterator(BrowserLinkedList<T> myList) {
        current = myList.getFirstNode();
    }

    @Override
    public boolean hasNext() {
        if(current != null && current.val != null) {
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        T data = current.val;
        current = current.next;
        return data;
    }
}
