package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task225Test {

    @Test
    public void testGetArrBitovoeOtricanie() {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arraynot = Task225.getArrBitovoeOtricanie(arr);
        assertEquals(arraynot[1],-3);
        assertEquals(arr[1],2);
    }
}