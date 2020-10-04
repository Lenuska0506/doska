package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {

    @Test
    public void testNextInt() {
        ResettableIntGenerator gen = new ResettableIntGenerator();
        assertEquals(gen.nextInt(), 0);
        assertEquals(gen.nextInt(), 1);
    }

    @Test
    public void testReset() {
        ResettableIntGenerator gen = new ResettableIntGenerator();
        gen.nextInt();
        gen.nextInt();
        gen.nextInt();
        gen.reset();
        assertEquals(gen.nextInt(), 0);
    }
}