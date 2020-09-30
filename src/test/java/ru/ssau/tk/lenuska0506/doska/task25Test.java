package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task25Test {
    int[] array = new task25().setNumber(8);

    @Test
    public void testSetNumber() {
        assertEquals(array.length, 8);
        assertEquals(array[0], 0);
        assertEquals(array[1], 1);
        assertEquals(array[2], 4);
        assertEquals(array[3], 9);
    }
}