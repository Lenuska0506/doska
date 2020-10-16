package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task223Test {

    @Test
    public void testSetArr() {

            int[] arr = new int[]{1,2,3,4,5};
            Task223.setArr(arr);
            assertEquals(arr[0],5);

        }
    }
