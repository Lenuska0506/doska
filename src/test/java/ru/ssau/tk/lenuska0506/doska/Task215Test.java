package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task215Test {

    @Test
    public void testSetArr() {
        int[] arr = {1,2,3,4,5};
        assertEquals(Task215.setArr(arr,1),true);
        assertEquals(Task215.setArr(arr,2),true);
        assertEquals(Task215.setArr(arr,6),false);
    }
}