package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task21Test {
    int[] arr = new Task21().setNumber(6);

    @Test
    public void testSetNumber() {
        assertEquals(arr.length, 6);
        assertEquals(arr[0], 0);
        assertEquals(arr[2], 2);
        assertEquals(arr[3], 3);

    }
}