package stackdata;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class MyArrayListTest {
    MyArrayList list;
    @Before
    public void setUp() {
        list = new MyArrayList(5);
    }

    @Test
    public void test_That_New_ArrayList_Is_Empty() {
        assertTrue(list.isEmpty());
    }

    @Test
    public void test_add_One_Element_ArrayList_Not_Empty() {
        list.myAdd(1,"list One");
        list.myAdd(2,"list Two");
        assertEquals(2, list.getSize());
    }

    @Test
    public void test_add_Two_Or_More_Element_ArrayList_Not_Empty() {
        list.myAdd(1,"list One");
        list.myAdd(2,"list Two");
        list.myAdd(3,"list Three");
        list.myAdd(4,"list Four");
        assertEquals(4, list.getSize());
    }

    @Test
    public void test_add_Element_Remove_2_Remainder_1() {
        assertTrue(list.isEmpty());
        list.myAdd(0,"list One");
        list.myAdd(1,"list Two");
        list.myAdd(2,"list Three");
        assertEquals(3, list.getSize());
        list.myRemove(0);
        list.myRemove(1);
        assertEquals(1, list.getSize());
    }

    @Test
    public void test_add_Element_Add_2_Remove_2_Remainder_0() {
        assertTrue(list.isEmpty());
        list.myAdd(0,"list One");
        list.myAdd(1, "list Two");
        list.myAdd(2, "list Three");
        list.myRemove(0);
        list.myRemove(1);
        list.myRemove(2);
        assertTrue(list.isEmpty());
        assertEquals(1, list.getSize());
    }
/*
    @Test
    public void test_add_Element_Show_That_Capacity_Can_Go_Beyond_InitialCapacity() {
        assertTrue(list.isEmpty());
        list.myAdd(1,"list One");
        list.myAdd (2,"list Two");
        list.myAdd(3,"list Three");
        assertEquals(3, list.getSize());
        assertTrue(list.isEmpty());
        list.myAdd (1,"list Four");
        list.myAdd(2,"list Five");
        list.myAdd(3,"list Six");
        assertEquals(3, list.getSize());
    }
*/

}
