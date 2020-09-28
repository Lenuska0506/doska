package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OperationTest {
    Operation.IdenticalOperation oper = new Operation.IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(oper.apply(1.0), 1.0);
        assertEquals(oper.apply(-2.0), -2.0);
        assertEquals(oper.apply(0), 0.0);
        assertEquals(oper.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY);
        assertEquals(oper.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        assertEquals(oper.apply(Double.NaN), Double.NaN);
    }
    


    @Test
    public void testApplyTriple() {
        assertEquals(oper.applyTriple(1.0), 1.0);
        assertEquals(oper.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY);
        assertEquals(oper.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        assertEquals(oper.apply(Double.NaN), Double.NaN);
    }
}