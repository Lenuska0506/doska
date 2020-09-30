package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task24Test {
    int[] array = new task24().setNumber(8);

    @Test
    public void testSetNumber() {
        assertEquals(array.length, 8);
        assertEquals(array[0], 16);
        assertEquals(array[1], 14);
        assertEquals(array[2], 12);
        assertEquals(array[3], 10);
    }
}


