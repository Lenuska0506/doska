package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Operation1Test {

    Operation.SqrtOperation oper = new Operation.SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(oper.apply(9), 3);
        assertEquals(oper.apply(4), 2);
        assertEquals(oper.apply(-4), 0);
        assertEquals(oper.apply(Double.NEGATIVE_INFINITY), 0);
        assertEquals(oper.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        assertEquals(oper.apply(Double.NaN), Double.NaN);

    }


    @Test
    public void testApplyTriple() {
        assertEquals(oper.applyTriple(1.0), 1.0);
        assertEquals(oper.apply(Double.NEGATIVE_INFINITY), 0);
        assertEquals(oper.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
        assertEquals(oper.apply(Double.NaN), Double.NaN);
    }
}