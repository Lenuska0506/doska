package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task31Test {

    @Test
    public void testSetString() {
        String arrStr = new String("str1,str2");
        new Task31().setString(arrStr);
    }
}