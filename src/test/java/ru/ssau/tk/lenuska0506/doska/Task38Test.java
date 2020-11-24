package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task38Test {

    @Test
    public void testIndexof() {
        assertEquals(Task38.indexof("SOS", "HELP"), -1);
        assertEquals(Task38.indexof("SOS", "OS"), 1);

    }
}
