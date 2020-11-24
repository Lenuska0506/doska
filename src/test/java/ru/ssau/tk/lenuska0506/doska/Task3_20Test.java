package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_20Test {

    @Test
    public void testGetUnifiedStr() {
        String[] str = {"супер", "круто", "конец", "ноября", ":("};
        assertEquals(Task3_20.getUnifiedStr(str), "супер, круто, конец, ноября, :(");
    }
}