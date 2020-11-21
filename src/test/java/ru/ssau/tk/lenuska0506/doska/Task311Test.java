package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task311Test {
    @Test
    public void testTheNumberOfStringArray() {
        String[] array = new String[]{"moloko", "wow", " and ", "love", " swim"};
        assertEquals(Task311.theNumberOfStringArray(array, "m", "o"), 1);
        assertEquals(Task311.theNumberOfStringArray(array,"w","w"),1);
    }

}