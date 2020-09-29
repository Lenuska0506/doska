package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint namedPoint= new NamedPoint();

    @Test
    public void testGetName() {
            assertEquals(namedPoint.getName(),"Origin");
    }

}