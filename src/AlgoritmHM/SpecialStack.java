package LessonAlgoritm;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SpecialStack<T> {

    public int count;
    public ArrayList<T> items;

    public SpecialStack() {
        this.count = 0;
        this.items = new ArrayList<>();
    }

    public void push(T element) {
        this.items.add(element);
        this.count++;
    }

    public T pop() {
        if (this.count == 0) {
            throw new EmptyStackException();
        }
        T deleteItem = this.items.remove(this.count - 1);
        this.count--;
        return deleteItem;
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public void clear() {
        this.items.clear();
        this.count = 0;
    }

    public T peek() {
        if (this.count == 0) {
            throw new EmptyStackException();
        }
        return this.items.get(this.count - 1);
    }

    public int getMin(SpecialStack<Integer> stack) {
        int min = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            int element = stack.pop();
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
