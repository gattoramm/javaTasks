package JUNIT.Udemi.practice5_beforeAll_afterAll;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.*;
import java.net.URL;
import java.io.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class DataTest {
    static ArrayList<Integer> numbersList;
    static URL path;
    static File file;
    static Scanner scanner;

    @BeforeAll
    public static void init() throws FileNotFoundException {
        numbersList = new ArrayList<>();
        path = DataTest.class.getResource("numbers.txt");
        file = new File(path.getFile());
        scanner = new Scanner(file);

        while (scanner.hasNext()) {
            Integer i = Integer.parseInt(scanner.next());
            numbersList.add(i);
        }
    }

    @Test
    public void testFindLargest() {
        int computedValue = Data.findLargest(numbersList);
        int expectedValue = 40;
        assertEquals(computedValue, expectedValue);
    }

    @AfterAll
    public static void tearDown() {
        scanner.close();
    }
}
