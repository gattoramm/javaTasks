package JUNIT.Udemi.practice1_assertEqual_assetNotEqual;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class assertEquals_assertNotEquals {
    int x = 2;
    int y = 2;
    int z = 3;

    @Test
    public void test1() {
        assertEquals(x, y);
    }

    @Test
    public void test2() {
        assertNotEquals(y, z);
    }
}
