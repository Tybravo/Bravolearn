package stackdata;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {
    private MyQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new MyQueue(4);
    }

    @Test
    public void test_That_New_Queue_IsEmpty_Test() {
        Assertions.assertTrue(queue.isEmpty());
    }

    @Test
    public void test_True_That_An_Item_Is_Added_To_New_Queue() {
        boolean addItem = queue.enqueue("Abia");
        Assertions.assertTrue(addItem);
    }

    @Test
    public void test_That_Two_Or_More_Items_Can_Be_Added_To_Queue() {
        queue.enqueue("Abia");
        queue.enqueue("Adamawa");
        Assertions.assertEquals(2, queue.getSize());
    }

    @Test
    public void test_That_The_First_Item_Can_Be_Removed_From_Queue() {
        queue.enqueue("Abia");
        queue.enqueue("Adamawa");
        queue.enqueue("Akwa-Ibom");
        queue.dequeue("Abia");
        Assertions.assertEquals(2, queue.getSize());
    }

    @Test
    void test_That_First_Item_is_Removed_From_Queue_And_Count_Remainder() {
        queue.enqueue("Abia");
        queue.enqueue("Adamawa");
        queue.enqueue("Akwa-Ibom");
        Assertions.assertEquals(3, queue.getSize());
        queue.dequeue("Abia");
        Assertions.assertEquals(2, queue.getSize());
    }

    @Test
    public void test_To_Remove_Empty_Queue() {
        queue.isEmpty();
        assertThrows(java.util.NoSuchElementException.class, () -> {
            queue.dequeue("Abia");
        });
    }

    @Test
    public void test_That_Three_Items_Are_Added_And_Removed_From_New_Queue() {
        queue.enqueue("Abia");
        queue.enqueue("Adamawa");
        queue.enqueue("Akwa-Ibom");
        Assertions.assertEquals(3, queue.getSize());
        queue.dequeue("Abia");
        queue.dequeue("Adamawa");
        queue.dequeue("Akwa-Ibom");
        Assertions.assertEquals(0, queue.getSize());
        Assertions.assertTrue(queue.isEmpty());

    }

    @Test
    public void test_To_Peek_Empty_Queue() {
        assertNull(queue.myPeek());
    }

}