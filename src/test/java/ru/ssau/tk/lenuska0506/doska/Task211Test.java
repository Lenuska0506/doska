package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task211Test {
double DELTA=0.0001;
    @Test
    public void testGetdelitei() {
        int[] Arr1 = Task211.getdelitei(7);
        assertEquals(Arr1[0], 1, 0.0001);
        assertEquals(Arr1[1], 7, 0.0001);


    }
}