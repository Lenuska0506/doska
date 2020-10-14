package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task222Test {

    @Test
    public void testGetIndexVhodnogoN() {
        int[] array = new int[]{1,2,3,4};
        assertEquals(Task222.getIndexVhodnogoN(array,4),3);

    }
}