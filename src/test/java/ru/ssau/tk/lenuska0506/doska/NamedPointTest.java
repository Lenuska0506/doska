package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint namedPoint= new NamedPoint();
    NamedPoint namedPoint1 = new NamedPoint(4, 4, 2, "kola");

    @Test
    public void testGetName() {
            assertEquals(namedPoint.getName(),"Origin");
        assertEquals(namedPoint1.getName(),"kola");
    }

}