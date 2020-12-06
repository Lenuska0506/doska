package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_7Test {
    double DELTA = 0.00001;
    @Test

    public void test() throws Exception {
        double[] test1 = Task2_7.setkdadratnoeyravnenie(1, 1, -2);
        assertEquals(test1[0], 1, DELTA);
        assertEquals(test1[1], -2, DELTA);
    }
}