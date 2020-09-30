package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task23Test {
    int[] array = new Task23().setNumber(8);
    @Test

    public void testSetNumber() {
        assertEquals(array.length, 8);
        assertEquals(array[0],1);

    }
}
