package homework_29;

import org.junit.platform.engine.support.hierarchical.Node;



public class MyQueueMethods<T> implements MyQueue<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;
    @Override
    public void addLast(T value) {
        if (first == null) {
            first = new Node<>(value, null, null);
        } else if (last == null) {
            last = new Node<>(value, first, null);
            first.next = last;
        } else {
            Node<T> temp = last;
            last = new Node<>(value, temp, null);
            temp.next = last;
        }
        size++;
    }

    @Override
    public void addFirst(T value) {
        if (first == null) {
            first = new Node<>(value, null, null);
        } else if (last == null) {
            last = first;
            first = new Node<>(value, null, last);
            last.previous = first;
        } else {
            Node<T> temp = first;
            first = new Node<>(value, null, temp);
            temp.previous = first;
        }
        size++;
    }

    @Override
    public T getFirst() {
        if (first != null) {
            return first.value;
        }
        return null;
    }

    @Override
    public T getLast() {
        if (first == null) {
            return null;
        }
        if (last == null) {
            return first.value;
        }
        return last.value;
    }

    @Override
    public T remove() {
        if (size == 0) return null;
        T value = first.value;
        if (size == 1) {
            first = null;
        } else if (size == 2) {
            first = last;
            first.previous = null;
            last = null;
        } else {
            first = first.next;
            first.previous = null;
        }
        size--;
        return value;
    }

    @Override
    public T removeFirst() {
        if (size == 0) return null;
        T value = first.value;
        if (size == 1) {
            first = null;
        } else if (size == 2) {
            first = last;
            first.previous = null;
            last = null;
        } else {
            first = first.next;
            first.previous = null;
        }
        size--;
        return value;
    }

    @Override
    public T removeLast() {
        if (size == 0) return null;
        T value;
        if (size == 1) {
            value = first.value;
            first = null;
        }
        else if (size == 2) {
            value = last.value;
            last = null;
            first.next = null;
        } else {
            value = last.value;
            last = last.previous;
            last.next = null;
        }
        size--;
        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (first != null) {
            sb.append(first.value);
            Node<T> cursor = first.next;
            while (cursor != null) {
                sb.append(", ");
                sb.append(cursor.value);
                cursor = cursor.next;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }
}
