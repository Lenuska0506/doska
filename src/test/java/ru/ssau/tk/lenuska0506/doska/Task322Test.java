package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task322Test {

    @Test
    public void testGetstrNumber() {
        assertEquals(Task322.getstrNumber(1),"0");
        System.out.println(Task322.getstrNumber(10000));
    }
}