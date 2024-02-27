package lesson_29;

import util.MyLinkedList;

import java.util.Arrays;


public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        System.out.println(linkedList);
        linkedList.add(100);
        System.out.println(linkedList);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        System.out.println(linkedList);
        linkedList.addFirst(50);
        System.out.println(linkedList);
        linkedList.addFirst(10);
        System.out.println(linkedList);

        System.out.println("remove value: " + linkedList.remove());
        System.out.println(linkedList);

        System.out.println("remove value: " + linkedList.remove());


        System.out.println(linkedList);
        System.out.println("remove last: " + linkedList.removeLast());

        System.out.println(linkedList);
        System.out.println("remove last: " + linkedList.removeLast());
        System.out.println("remove last: " + linkedList.removeLast());
        System.out.println("remove last: " + linkedList.removeLast());

        System.out.println(linkedList);
        System.out.println("linkedList.removeLast(): " + linkedList.removeLast());

        linkedList.add(555);
        System.out.println(linkedList);
        System.out.println("lastIndexOf(555): " + linkedList.lastIndexOf(555));
        linkedList.remove();
        System.out.println(linkedList.lastIndexOf(151));

        System.out.println("\n=====================\n");

        linkedList.addAll(0, 1, 2, 3, 4, 5, 6, 7);
        System.out.println(linkedList);

        int index = linkedList.indexOf(3);
        System.out.println("index 3: " + index);
        System.out.println(linkedList.indexOf(7));
        System.out.println(linkedList.indexOf(100));

        System.out.println(linkedList.contains(10));

        //MyLinkedList<Integer> linkedList1 = new MyLinkedList<>();
        Integer[] result = linkedList.toArray();
        System.out.println(Arrays.toString(result));

        System.out.println(linkedList.remove(Integer.valueOf(-1)));
        System.out.println(linkedList);

        System.out.println(linkedList.remove(-1));
        System.out.println(linkedList);

        System.out.println(linkedList.get(2));
        System.out.println(linkedList);

        linkedList.set(1, 100);
        System.out.println(linkedList);

        MyLinkedList<String> linkedList1 = new MyLinkedList<>();
        linkedList1.addAll("Str", "Str1", "Str2", "Str3", "Str4");
        System.out.println(linkedList1);
        System.out.println(linkedList1.remove(0));
        System.out.println(linkedList1);
        System.out.println(linkedList1.remove(4));
        System.out.println(linkedList1);






    }
}
