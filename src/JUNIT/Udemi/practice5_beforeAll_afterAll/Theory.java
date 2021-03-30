package JUNIT.Udemi.practice5_beforeAll_afterAll;


import org.junit.Test;
import org.junit.jupiter.api.*;

public class Theory {

    @BeforeAll
    public static void setup() {
        System.out.println("first");
    }

    @AfterAll
    public static void teardown() {
        System.out.println("last");
    }

    @Test
    public void test1() {
        System.out.println("now running test1");
    }

    @Test
    public void test2() {
        System.out.println("now running test2");
    }
}
