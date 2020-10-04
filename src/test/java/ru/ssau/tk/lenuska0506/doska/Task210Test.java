package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task210Test {
    double[] arr = new Task210().setGeometr(6, 1.0, 2.0);
    @Test
    public void testSetNumber() {
        assertEquals(arr.length, 6);
        assertEquals(arr[0], 1);
        assertEquals(arr[1], 2);
        assertEquals(arr[2], 4);


    }
}