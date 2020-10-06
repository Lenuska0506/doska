package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task216Test {

    @Test
    public void testSetArr() {
        Integer[] arr = new Integer[5];
        arr[1] = null;
        arr[0] = 1;
        arr[2] = 2;
        arr[3] = 5;
        arr[4] = null;
        assertTrue(Task216.setArr(arr));


    }

}