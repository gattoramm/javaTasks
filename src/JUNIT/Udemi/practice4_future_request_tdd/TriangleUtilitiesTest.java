package JUNIT.Udemi.practice4_future_request_tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleUtilitiesTest {
    @Test
    public void testIsEquilateral() {
        assertFalse(TriangleUtilities.isEquilateral(2, 3, 4));
        assertFalse(TriangleUtilities.isEquilateral(2, 3, 3));
        assertTrue(TriangleUtilities.isEquilateral(4, 4, 4));
    }
}
