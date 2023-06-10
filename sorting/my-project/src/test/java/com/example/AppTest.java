package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testSorting() {
        String[] args = {"5", "2", "7", "1", "9"};
        App.main(args);
        // Add assertions to verify the sorted output
        // For example:
        // assertArrayEquals(new int[]{1, 2, 5, 7, 9}, App.getSortedNumbers(args));
    }
}
