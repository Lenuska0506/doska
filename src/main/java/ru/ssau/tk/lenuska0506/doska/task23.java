package ru.ssau.tk.lenuska0506.doska;

public class task23 {
    public  int[] setNumber(int size) {
        int[] array = new int[size];
        array[0] = 1;
        for (int i = 1; i < array.length - 1; i++) {
            array[i] = i+2;
        }
        return array;
    }
}

