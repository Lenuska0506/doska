package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task226Test {

    @Test
    public void testGetSumParn() {
        assertEquals(Task226.getSumParn(new int[]{1, 2, 3, 4, 5}), new int[]{3, 7, 5});

    }
}