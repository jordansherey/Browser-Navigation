import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BrowserNavigation<T> {
    BrowserStack<T> fStack = new BrowserStack<>();
    BrowserStack<T> bStack = new BrowserStack<>();
    BrowserQueue<T> browserHistory = new BrowserQueue<>();

    T urlCurrent;

    public void visitWebsite(T url) {
        if(urlCurrent != null) {
            bStack.push(urlCurrent);
        }
        urlCurrent = url;
        browserHistory.enqueue(url);

        fStack.clearStack();
        System.out.println("Now at" + url);
        OpenWebpage launch = new OpenWebpage();
        launch.launchBrowser((String) url);
    }

    public void goBack() {
        if(bStack.isEmpty()) {
            throw new NoSuchElementException();
        }
        fStack.push(urlCurrent);
        urlCurrent = bStack.pop();
        System.out.println("Now at" + urlCurrent);
    }

    public void goForward() {
        if(fStack.isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        bStack.push(urlCurrent);
        urlCurrent = fStack.pop();
        System.out.println("Now at" + urlCurrent);
    }

    public void showHistory() {
        Iterator<T> it = browserHistory.iterator();
        int i = 1;

        System.out.println("User Browsing History");
        while(it.hasNext()){
            System.out.print(i + " ");
            System.out.println(it.next());
            i++;
        }
    }

    public void clearHistory() {
        browserHistory.clearQueue();
        bStack.clearStack();
        fStack.clearStack();
        urlCurrent = null;
        System.out.println("History has been cleared");
    }

    public void closeBrowser() {
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("sessionData.txt"))) {
            output.writeObject(saveStack(bStack));
            output.writeObject(saveStack(fStack));
            output.writeObject(browserHistory);
    } catch(IOException error) {
        error.printStackTrace();
    }
}

public BrowserLinkedList<T> saveStack(BrowserStack<T> stack) {
    BrowserLinkedList<T> myList = new BrowserLinkedList<T>();
    StackIterator<T> iterator = new StackIterator<T>(stack.getList());
    while(iterator.hasNext()) {
        myList.addLast(iterator.next());
        }
    return myList;
    }
}















