package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {

    @Test
    public void testNextInt() {
        IntGenerator gen = new IntGeneratorImpl();
        assertEquals(gen.nextInt(), 0);
        assertEquals(gen.nextInt(), 1);
        assertEquals(gen.nextInt(), 2);
        assertEquals(gen.nextInt(), 3);
    }
}