import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class YourOrderPleaseTest {
    private YourOrderPlease order;

    @Before
    public void setUp() throws Exception {
        order = new YourOrderPlease();
    }
    @Test
    public void emptyString() {
        assertEquals("", order.order(""));
    }

    @Test
    public void returnsOrderedTwoWordString() {
        assertEquals("Th1s is2", order.order("is2 Th1s"));
    }

    @Test
    public void returnsOrderedThreeWordString() {
        assertEquals("Thi1s is2 3a", order.order("is2 Thi1s 3a"));
    }

    @Test
    public void returnsOrderedFourWordString() {
        assertEquals("Thi1s is2 3a", order.order("is2 Thi1s 3a"));
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", order.order("4of Fo1r pe6ople g3ood th5e the2"));
        assertEquals("Thi1s is2 3a T4est", order.order("is2 Thi1s T4est 3a"));
    }

}