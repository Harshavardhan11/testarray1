package org.example;
// File: ArrayListTest.java
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class ArrayListTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetIndexOutOfBounds() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Trying to access an index that is out of bounds
        list.get(3); // This should throw IndexOutOfBoundsException
    }

    @Test
    public void testEmptyArrayList() {
        ArrayList<String> list = new ArrayList<>();

        // Test that an empty list has size 0
        assertEquals(0, list.size());

        // Trying to access an index in an empty list should throw IndexOutOfBoundsException
        try {
            list.get(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception
        }
    }

    @Test
    public void testAddAndRemove() {
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Test size
        assertEquals(3, list.size());

        // Test get method
        assertEquals("Banana", list.get(1));

        // Test remove
        list.remove(1);
        assertEquals(2, list.size());
        assertEquals("Orange", list.get(1));
    }

    @Test
    public void testAddNull() {
        ArrayList<String> list = new ArrayList<>();

        // Add null
        list.add(null);

        // Test size
        assertEquals(1, list.size());

        // Test get method
        assertNull(list.get(0));
    }

    @Test
    public void testClear() {
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");

        // Test size
        assertEquals(2, list.size());

        // Clear the list
        list.clear();

        // Test size
        assertEquals(0, list.size());

        // Test isEmpty method
        assertTrue(list.isEmpty());
    }

    @Test
    public void testContains() {
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");

        // Test contains method
        assertTrue(list.contains("Apple"));
        assertFalse(list.contains("Orange"));
    }

    @Test
    public void testIndexOf() {
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        // Test indexOf method
        assertEquals(0, list.indexOf("Apple"));
        assertEquals(1, list.indexOf("Banana"));
        assertEquals(-1, list.indexOf("Orange"));
    }

    @Test
    public void testLastIndexOf() {
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        // Test lastIndexOf method
        assertEquals(2, list.lastIndexOf("Apple"));
        assertEquals(1, list.lastIndexOf("Banana"));
        assertEquals(-1, list.lastIndexOf("Orange"));
    }
}
