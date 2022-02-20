package lecture;

import java.util.ArrayList;

public class CustomQueue<T> {
    public ArrayList<T> customQueue = new ArrayList<T>();

    public boolean add(T item) {
        return customQueue.add(item);
    }

    public T poll() {
        if (customQueue.isEmpty()) {
            return null;
        }
        return customQueue.remove(0);
    }

    public boolean isEmpty() {
        return customQueue.isEmpty();
    }

    @Override
    public String toString() {
        return customQueue.toString();
    }
}
