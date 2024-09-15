package PersonProblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;

import static PersonProblem.TYPE.EDUCATION;
import static PersonProblem.TYPE.FINANCIAL;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    Person person;
    @BeforeEach
    public void setUp() {
        person = new Person("", EDUCATION);
    }
    private void assertEquals(Object o) {
    }

    @Test
    public void test_That_Person_Exist() {
        assertTrue(person.isPersonExist(true));
    }

    @Test
    public void test_Person_Problem_Can_Be_Created_By_Name_Type() {
        String name = ("");
        Type type = person.setType(FINANCIAL).getClass();
        assertEquals(person.create(name, type));
    }

    @Test
    public void test_Num_Of_Unsolved_Person_Problem() {
        int unsolvedProb = person.countUnsolvedProblems();
        Assertions.assertEquals(2, unsolvedProb);
    }

    @Test
    public void test_List_Of_Person_Problem_Gotten() {
        String name = person.getProblemsList("Assignment", EDUCATION).toString();
        String name2 = person.getProblemsList("Cashflow", FINANCIAL).toString();
        assertEquals(name);
        assertEquals(name2);
    }

    @Test
    public void test_Person_Problem_Name_Cannot_Be_Found() {
        String name1 = person.getProblemsList("", FINANCIAL).toString();
        String name2 = person.getProblemsList("", FINANCIAL).toString();
        assertEquals(name1);
        assertEquals(name2);
    }

}
