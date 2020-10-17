package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task227Test {

    @Test
    public void testGetboolean() {
            assertEquals(Task227.getboolean(new int[]{1,2,3,4,5}), new boolean[]{false,true,false,true,false});
        }
    }
