package lesson_29;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.Node;
import util.MyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    MyLinkedList linkedList;

    @BeforeEach
    public void setUp() {
        linkedList = new MyLinkedList();
    }


    @Test
public void testAdd() {
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
        linkedList.addAll(100, 200, 300, 400, 500);
        assertTrue(linkedList.contains(100));
        assertTrue(linkedList.contains(200));
        assertTrue(linkedList.contains(300));
        assertEquals(100, linkedList.get(0));
        assertEquals(500, linkedList.get(4));
        assertEquals(5, linkedList.size());
    }
    @Test
    public void testRemoveFirst() {
        linkedList.addAll(100, 200, 300, 400, 500);
        linkedList.remove();
        assertFalse(linkedList.contains(100));
        assertEquals(4, linkedList.size());
        assertEquals(200, linkedList.get(0));

    }
    @Test
    public void testRemoveLast() {
        linkedList.addAll(100, 200, 300, 400, 500);
        linkedList.removeLast();
        assertFalse(linkedList.contains(500));
        assertEquals(4, linkedList.size());
        assertEquals(400, linkedList.get(3));
    }
    @Test
    public void testRemoveValue() {
        linkedList.addAll(100, 200, 300, 400, 500);
        linkedList.remove(Integer.valueOf(300));
        assertFalse(linkedList.contains(300));
        assertEquals(4, linkedList.size());
        assertEquals(400, linkedList.get(2));
    }
    @Test
    public void testRemoveInvalidValue() {
        linkedList.addAll(100, 200, 300, 400, 500);
        linkedList.remove(Integer.valueOf(10));
        assertEquals(5, linkedList.size());
    }
    @Test
    public void testRemoveIndex() {
        linkedList.addAll(100, 200, 300, 400, 500);
        linkedList.remove(1);
        assertFalse(linkedList.contains(200));
        assertEquals(4, linkedList.size());
        assertEquals(300, linkedList.get(1));
    }
    @Test
    public void testRemoveInvalidIndex() {
        linkedList.addAll(100, 200, 300, 400, 500);
        linkedList.remove(-1);
        assertEquals(5, linkedList.size());
    }

    @Test
    public void testIndexOf() {
        linkedList.addAll(100, 200, 300, 400, 500);
        assertEquals(-1, linkedList.indexOf(1000));
    }
    @Test
    public void testLastIndexOf() {
        linkedList.addAll(100, 100, 310, 200, 300);
        assertEquals(-1, linkedList.lastIndexOf(1000));
    }


}
