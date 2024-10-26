package stackdata;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack(3);
    }

    @Test
    public void test_That_NewStack_IsEmpty_Test() {
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    public void push_OneElement_StackNotEmpty_Test() {
        Assertions.assertTrue(stack.isEmpty());
        stack.push("A-String");
        Assertions.assertEquals(1, stack.getSize());
    }

    @Test
    public void push_More_han_One_Element_StackNotEmpty_Test() {
        Assertions.assertTrue(stack.isEmpty());
        stack.push("A-String");
        stack.push("B-String");
        Assertions.assertEquals(2, stack.getSize());
    }

    @Test
    public void toPush_Pop_Stack_StackIsEmpty_Test() {
        stack.push("A-String");
        Assertions.assertEquals(1, stack.getSize());
        stack.pop();
        Assertions.assertEquals(0, stack.getSize());
    }

    @Test
    public void toPush_AB_Pop_B_Stack_StackIs_Not_Empty_Test() {
        stack.push("A-String");
        stack.push("B-String");
        Assertions.assertEquals(2, stack.getSize());
        stack.pop();
        Assertions.assertEquals(1, stack.getSize());
    }

    @Test
    public void toPush_ABC_Pop_B_Stack_StackIs_Not_Empty_Test() {
        stack.push("A-String");
        stack.push("B-String");
        stack.push("C-String");
        Assertions.assertEquals(3, stack.getSize());
        stack.pop();
        Assertions.assertEquals(2, stack.getSize());
    }

    @Test
    public void toPush_ABC_Pop_AB_Stack_Is_Empty_Test() {
        stack.push("A-String");
        stack.push("B-String");
        stack.push("C-String");
        Assertions.assertEquals(3, stack.getSize());
        stack.pop();
        stack.pop();
        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    public void toPush_More_Than_Capacity_Stack_Is_Full_Test() {
        stack.push("A-String");
        stack.push("B-String");
        stack.push("C-String");
        Assertions.assertEquals(3, stack.getSize());
        stack.push("D-String");
        Assertions.assertEquals(3, stack.getSize());
    }

}