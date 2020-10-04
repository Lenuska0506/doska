package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task214Test {

    @Test
    public void testSetarr() {
        double arr[] = new double[] {-1,-2,1,2};
        Task214.setarr(arr);
        assertEquals(arr[0], 1);
        assertEquals(arr[1], 2);
        assertEquals(arr[2], -1);
        assertEquals(arr[3], -2);

    }
}
