import org.junit.Test;
import static org.junit.Assert.*;

public class TestTravis {
    @Test
    public void testAddFive() {
        assertEquals(5, TravisTestclass.returnFive());
    }
}
