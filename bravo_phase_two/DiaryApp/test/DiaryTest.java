import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DiaryTest {
    Diary diary;
    @BeforeEach
    public void setUp() {
        diary = new Diary();
    }

    @Test
    public void test_That_Diary_Is_Unlocked() {
        assertFalse(diary.isLocked());
    }

    @Test
    public void test_That_Locked_Diary_Can_Be_Unlocked() {
        diary.lock();
        diary.unlock();
        assertFalse(diary.isLocked());

    }
    @Test
    public void test_That_Unlocked_Diary_Can_Be_Locked() {
        diary.unlock();
        diary.lock();
        assertTrue(diary.isLocked());
    }

}
