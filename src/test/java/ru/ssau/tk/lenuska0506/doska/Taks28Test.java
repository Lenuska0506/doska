package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Taks28Test {
    double[]  arr = new Taks28().setNumber(8);

    @Test
    public void testSetNumber() {
        assertEquals(arr.length, 8);
        assertEquals(arr[0], 1);
        assertEquals(arr[2], 4);
        assertEquals(arr[3], 5);

    }
}

