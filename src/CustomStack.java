import java.util.ArrayList;

public class CustomStack<T> {
    private ArrayList<T> customStack = new ArrayList<T>();

    public T push(T item) {
        customStack.add(item);
        return item;
    }

    public T pop() {
        if (customStack.isEmpty())
            return null;
        return customStack.remove(customStack.size() - 1);
    }

    public boolean isEmpty() {
        return customStack.isEmpty();
    }

    @Override
    public String toString() {
        return customStack.toString();
    }
}
