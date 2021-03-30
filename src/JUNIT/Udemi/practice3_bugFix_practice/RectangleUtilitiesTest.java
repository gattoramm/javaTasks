package JUNIT.Udemi.practice3_bugFix_practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleUtilitiesTest {
    @Test
    public void testGetPerimeter() {
        int height = 4;
        int width = 6;
        int expected = 20;
        int actual = RectangleUtilities.getPerimeter(height, width);

        assertEquals(expected, actual);
    }
}
