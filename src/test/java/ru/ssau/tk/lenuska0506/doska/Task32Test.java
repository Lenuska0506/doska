package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task32Test {

    @Test
    public void testGetStr() {
        String strt1 = "wow";
        new Task32().getStr(strt1);
        String strt2 = "вау";
        new Task32().getStr(strt2);
    }
}