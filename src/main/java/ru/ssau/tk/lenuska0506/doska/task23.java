package ru.ssau.tk.lenuska0506.doska;

public class task23 {
    public  int[] setNumber(int size) {
        int[] array = new int[size];
        int a=1;
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = a;
            a=a+2;


        }
        return array;
    }
}
class task24{
    public  int[] setNumber(int size) {
        int[] array = new int[size];
        int a=2*size;
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = a;
            a-=2;
        }
        return array;
    }
}
class task25{
    public  int[] setNumber(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = i*i;

        }
        return array;
    }
}


