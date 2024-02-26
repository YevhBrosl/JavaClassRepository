package homework_29;

import util.MyLinkedList;

public class MyQueueApp {
    public static void main(String[] args) {
        MyQueueMethods<String> queue = new MyQueueMethods<>();
        System.out.println(queue.toString());
        queue.addFirst("John");
        queue.addLast("Peter");
        System.out.println(queue.toString());
        queue.addFirst("Jack");
        queue.addLast("Paul");
        System.out.println(queue.toString());
        System.out.println(queue.getFirst());
        System.out.println(queue.getLast());
        queue.removeFirst();
        System.out.println(queue.toString());
        queue.removeLast();
        System.out.println(queue.toString());


    }
}
