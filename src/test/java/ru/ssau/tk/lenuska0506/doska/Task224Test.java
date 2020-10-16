package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task224Test {

    @Test
    public void testGetBitovoeOtricanie() {

            int[] arr = new int[]{1,2,3,4,5};
            Task224.getBitovoeOtricanie(arr);
            assertEquals(arr[1],-3);
            Task224.getBitovoeOtricanie(arr);
            assertEquals(arr[1],2);
        }
    }
