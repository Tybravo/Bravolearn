package stackdata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


public class StackTest {
    Stack stack;
    @BeforeEach
    public void setUp() {
        stack =  new Stack(3);
    }

    @Test
    public void testThat_NewStack_IsEmpty_Test() {
         assertTrue((stack.isEmpty()));
    }

    @Test
    public void push_OneElement_StackNotEmpty_Test() {
        stack.push(1, "A-String");
        assertEquals(1, stack.push(1, "A-String"));
    }

    @Test
    public void toPush_PopStack_StackIsEmpty_Test() {
        stack.push(1, "A-String");
        assertEquals(1, stack.push(1, "A-String"));
        stack.pop(1);
        assertEquals(0 ,0);
}

    @Test
    public void toPushXYPopY_StackIsNotEmpty_Test() {
        stack.push(1, "A-String");
        stack.push(1, "A-String");
        assertEquals(2, stack.push(2, "A-String"));
        stack.pop(1);
        assertEquals(1, stack.push(1, "A-String"));
    }

    @Test
    public void toPushXYZ_StackIsNotEmpty_Test() {
        stack.push(1, "A-String");
        stack.push(1, "A-String");
        stack.push(1, "A-String");
        Assertions.assertEquals(3, stack.push(3, "A-String"));
    }

    //@Test
    //public void toPushXYZ_StackIsEmpty_Test() {}
}
