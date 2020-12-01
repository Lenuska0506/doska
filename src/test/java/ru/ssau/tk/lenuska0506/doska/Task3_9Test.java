package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_9Test {

    @Test
    public void testGetIndexOf() {
        assertEquals(Task3_9.getIndexOf("закройте ссесию ","закрой"),0);
        assertEquals(Task3_9.getIndexOf("help me","p"),3);
    }
}