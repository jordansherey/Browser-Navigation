import java.util.Iterator;
import java.util.NoSuchElementException;

public class BrowserStack<T> implements Iterable<T> {
    private BrowserLinkedList<T> myStack;


    public BrowserStack() {
        myStack = new BrowserLinkedList<T>();

    }

    public BrowserLinkedList<T> getList() {
        return myStack;
    }

    public void push(T webPage) {
        myStack.addLast(webPage);
    }

    public T pop() {
        if(myStack.isEmpty()) {
            throw new NoSuchElementException();
        }
        return myStack.removeLast();
    }

    public T peek() {
        if(myStack.isEmpty()) {
            throw new NoSuchElementException();
        }
        return myStack.getLast();
    }

    public void clearStack() {
        myStack.clear();
    }

    public boolean isEmpty() {
        return myStack.size() == 0;
    }

    public int size() {
        return myStack.size();
    }

    public Iterator<T> iterator() {
        return myStack.iterator();
    }



}