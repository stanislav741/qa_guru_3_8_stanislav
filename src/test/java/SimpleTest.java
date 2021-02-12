import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    void positiveCase() {
        assertEquals(2 * 2, 4);
    }

    @Test
    void negativeCase() {
        assertEquals(2 * 2, 5);
    }

}
