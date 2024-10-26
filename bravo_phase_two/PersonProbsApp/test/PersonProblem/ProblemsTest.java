package PersonProblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static PersonProblem.TYPE.EDUCATION;
import static PersonProblem.TYPE.FINANCIAL;
import static org.junit.jupiter.api.Assertions.*;


public class ProblemsTest {
    Problems prob;
    @BeforeEach
    public void setUp() {
        prob = new Problems("", false);
    }

    @Test
    public void tessThat_PersonProblems_exist() {
        prob.setType(EDUCATION);
        assertTrue(prob.isProblemExist(EDUCATION));
    }

    @Test
    public void tessThat_PersonProblems_isSolved() {
        prob.setType(FINANCIAL);
        assertFalse(prob.isSolved());
    }
}
