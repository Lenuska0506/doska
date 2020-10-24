package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_12Test {
double DELTA=0.0001;
    @Test
    public void testGetDividersOfNumbers() {
        double[] firstArr = Task2_12.getDividersOfNumbers(6);
        assertEquals(firstArr[0], 1, 0.0001);
        assertEquals(firstArr[1], 2, 0.0001);
        assertEquals(firstArr[2], 3, 0.0001);
    }
}