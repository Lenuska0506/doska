package ru.ssau.tk.lenuska0506.doska;

public class Task22 {
    public int[] setNumber(int size) {
        int[] array = new int[size];
        array[0] = 2;
        array[size - 1] = 2;
        for (int i = 1; i < array.length - 1; i++) {
            array[i] = 1;
        }
        return array;
    }
}
class Taks28 {
    static double[] setNumber(int size) {
        double[] arr = new double[size];
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (j % 3 == 0) {
                j++;
            }
            arr[i] = j;
            j++;
        }
        return arr;
    }
}
class Task29 {
    public static int[] setprogressia(int N, int d, int size) {
        int[] arr = new int[size];
        arr[0] = N;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + d;
        }
        return arr;
    }
}


