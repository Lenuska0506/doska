package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task37Test {

    @Test
    public void testGetIndexStr() {
        assertEquals(Task37.getIndexStr("abcabcabc","ca"),2);

    }
}