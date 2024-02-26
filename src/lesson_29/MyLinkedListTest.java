package lesson_29;

import org.junit.jupiter.api.Test;
import util.MyLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyLinkedListTest {


    @Test
public void testAdd() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        assertTrue(linkedList.contains(100));
        assertTrue(linkedList.contains(200));
        assertTrue(linkedList.contains(300));
        assertEquals(100, linkedList.get(0));
        assertEquals(200, linkedList.get(1));
        assertEquals(300, linkedList.get(2));
        assertEquals(3, linkedList.size());
    }

    @Test
    public void testAddFirst() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.addFirst(300);
        assertTrue(linkedList.contains(100));
        assertTrue(linkedList.contains(200));
        assertTrue(linkedList.contains(300));
        assertEquals(300, linkedList.get(0));
        assertEquals(100, linkedList.get(1));
        assertEquals(200, linkedList.get(2));
        assertEquals(3, linkedList.size());
    }

    @Test
    public void testAddAll() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAll(100, 200, 300, 400, 500);
        assertTrue(linkedList.contains(100));
        assertTrue(linkedList.contains(200));
        assertTrue(linkedList.contains(300));
        assertEquals(100, linkedList.get(0));
        assertEquals(500, linkedList.get(4));
        assertEquals(5, linkedList.size());
    }
}
