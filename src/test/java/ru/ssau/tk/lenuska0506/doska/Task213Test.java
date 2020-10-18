package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task213Test {

    @Test
    public void testGetArr() {
        int[] arr = Task213.getArr(7);
        double DELTA = 0.0001;
        assertEquals(arr[0], 1, DELTA);
        assertEquals(arr[6], 1, DELTA);
        assertEquals(arr[3], 4, DELTA);
        assertEquals(arr[2], 3, DELTA);
        assertEquals(arr[5], 2, DELTA);
    }
}