package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task310Test {

    @Test
    public void testSet() {
        String[]arr = new String[]{"zoo","work","add","zdoo"};
        assertEquals( Task310.set(arr,"z","o"),2);
    }
}