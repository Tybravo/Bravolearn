package stackdata;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    Queue<String> queue;
    @BeforeEach
    void setUp() {
        queue = new LinkedList<>();
        int capacity = 5;
    }

    @Test
    void test_That_New_Queue_IsEmpty_Test() {
        Assertions.assertTrue(queue.isEmpty());
    }

    @Test
    void test_That_An_Item_Is_Added_To_New_Queue() {
        queue.add("Number One");
        Assertions.assertEquals(1, queue.size());
    }
@Test
    void test_That_Three_Items_Are_Added_To_New_Queue() {
        queue.add("Number One");
        queue.add("Number Two");
        queue.add("Number Three");
        Assertions.assertEquals(3, queue.size());
    }

    @Test
    void test_That_First_Item_is_Removed_From_Queue_And_Count_Remainder() {
        queue.add("Number One");
        queue.add("Number Two");
        queue.add("Number Three");
        Assertions.assertEquals(3, queue.size());
        queue.remove("Number One");
        Assertions.assertEquals(2, queue.size());
    }

    @Test
    void test_That_First_Item_is_Removed_From_Queue() {
        queue.add("Number One");
        queue.add("Number Two");
        queue.add("Number Three");
        Assertions.assertEquals(3, queue.size());
        Assertions.assertEquals(queue.remove(),"Number One");
        Assertions.assertEquals(queue.peek(),"Number Two");
        Assertions.assertEquals(2, queue.size());
    }

    @Test
    public void test_To_Remove_Empty_Queue() {
        assertThrows(java.util.NoSuchElementException.class, () -> {queue.remove();
        });
    }

    @Test
    public void test_To_AAdd_To_Full_Queue() {
        int capacity = 4;
        if(queue.size() >= capacity) {
            queue.add("Number One");
            queue.add("Number Two");
            queue.add("Number Three");
            queue.add("Number Four");
            Assertions.assertEquals(4, queue.size());
            Assertions.assertFalse(queue.add("Number Five"));
        }
    }

    @Test
    public void test_To_Peek_Empty_Queue() {
        assertNull(queue.peek());
    }

}
