package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task217Test {

    @Test
    public void testNumber() {
        int[] arr = new int[5];
        for(int i=1;i<arr.length;i++){
            arr[i] = i;
        }
        assertEquals(Task217.number(arr),3);
    }
}
