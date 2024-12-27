import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {


    @Test
    public void test1() {
        assertEquals(0, Main.countSpecialCharacters(""));
    }

    @Test
    public void test2() {
        assertEquals(0, Main.countSpecialCharacters(null));
    }

    @Test
    public void test3() {
        assertEquals(0, Main.countSpecialCharacters("Hello123"));
    }

    @Test
    public void test4() {
        assertEquals(5, Main.countSpecialCharacters("!@#$%"));
    }

    @Test
    public void test5() {
        assertEquals(3, Main.countSpecialCharacters("Hello! @#123"));
    }
}
