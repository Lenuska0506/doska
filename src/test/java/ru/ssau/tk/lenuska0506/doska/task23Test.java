package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task23Test {

    int[] array = new task23().setNumber(8);

        @Test
        public void testSetNumber() {
            assertEquals(array.length, 8);
            assertEquals(array[0], 1);
            assertEquals(array[1], 3);
            assertEquals(array[2], 5);
            assertEquals(array[3], 7);
        }
    }

