import java.util.Iterator;
import java.util.NoSuchElementException;

public class BrowserQueue<T> implements Iterable<T> {
   private BrowserArrayList<T> q;

   public BrowserQueue() {
       q = new BrowserArrayList<T>();
   }

   public BrowserQueue(int startCapacity) {
       q = new BrowserArrayList<>(startCapacity);
   }

   // enqueue add to back of queue
    // most recent
    public void enqueue(T url) {
      q.addLast(url);
    }

    // dequeue remove from front of queue
    // oldest history
    public T dequeue() {
       if(q.isEmpty()) {
           throw new NoSuchElementException();
       }
       return  q.removeFirst();
    }

    public T peek() {
       if(q.isEmpty()) {
           throw new NoSuchElementException();
       }
       return q.getFirst();
    }

    public T peekLast() {
       if(q.isEmpty()) {
           throw new NoSuchElementException();
       }
       return q.getLast();
    }

    public void clearQueue() {
        q.clear();
    }

    public boolean isEmpty() {
       return q.isEmpty();
    }

    public int size() {
       return q.size();
    }

    @Override
    public Iterator<T> iterator() {
       return q.iterator();
    }
}
