package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task29Test {

    int[] arr = new Task29().setprogressia(1, 1, 5);

    @Test
    public void testSetNumber() {
        assertEquals(arr.length, 5);
        assertEquals(arr[0], 1);
        assertEquals(arr[1], 2);
        assertEquals(arr[2], 3);


    }
}