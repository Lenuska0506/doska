package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task219Test {

    @Test
    public void testGetArrSum() {
        int[] array = new int[]{1,2,3,4,5};
        assertEquals(Task219.getArrSum(array),10);
    }
}
