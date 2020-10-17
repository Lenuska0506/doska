package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task233Test {

    @Test
    public void testGetArrSting() {
        String[] arr = new String[]{"World of ","Tanks"};
        Task233.getArrSting(arr);
    }
}
