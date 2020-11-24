package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_4Test {

    @Test
    public void testPalindrom() {
        assertEquals(Task3_4.palindrom("zeze"),false);
        assertEquals(Task3_4.palindrom("ezeze"),true);
    }
}