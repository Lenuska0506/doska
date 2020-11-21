package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task312Test {

    @Test
    public void testSet() {
        assertEquals(new Task312().set("opopopopo", "opo", "po"), "popppo");
    }
}