package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task313Test {
    @Test
    public void test() {
        String str = "i understend this now";
        assertEquals(Task313.getStringOfIndex(str, -1, 14), str.substring(0,14 ));

    }

}