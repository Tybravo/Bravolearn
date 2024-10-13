package stackdata;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListTest {
    ArrayList<String> list;
    @Before
    public void setUp() {
        list = new ArrayList<>();
    }

    @Test
    public void test_That_New_ArrayList_Is_Empty() {
        assertTrue(list.isEmpty());
    }

    @Test
    public void test_Push_One_Element_ArrayList_Not_Empty() {
        list.add(null);
    }
}
