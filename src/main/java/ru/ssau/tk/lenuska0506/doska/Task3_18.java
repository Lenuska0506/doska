package ru.ssau.tk.lenuska0506.doska;

import java.util.Arrays;

public class Task3_18  {
    public static void getDescription(Object obj){
        System.out.println("Описание объекта: ");
        System.out.println(obj);
    }
} class Task3_9 {
    static int getIndexOf(String str1,String str2){
        return str1.lastIndexOf(str2, str1.length()/2);
    }
}
 class Task3_19 {
     static String[] parseStringOnArr(String str) {
         String[] arrStr = str.split(" ");
         return Arrays.stream(arrStr)
                 .filter(s -> !s.isEmpty())
                 .map(s -> s.replace(
                         String.valueOf(s.charAt(0)),
                         String.valueOf(s.charAt(0)).toUpperCase()
                 ))
                 .toArray(String[]::new);
     }
 }
 class Task2_7 {
    public static double[] setkdadratnoeyravnenie(double a, double b, double c) throws Exception {
        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    throw new Exception("нет  корней");
                } else {
                    throw new Exception("комплексные корни ");
                }
            } else {
                return new double[]{-c / b};// bx+c = 0
            }
        } else {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                return new double[]{(-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a)};
            } else if (d == 0) {
                return new double[]{-b / (2 * a)};
            } else {
                throw new NullPointerException("Решение не относится к вещественным числам");
            }
        }
    }
}
 class Task2_30 {
    static int[][] getVector(int size) {
        int[][] arr = new int[size][];
        int k = 1;
        for (int i = 0; i < size; i++) {
            arr[i] = new int[size - i];
            for (int j = 0; j < size - i; j++) {
                arr[i][j] = k;
                k++;
            }
        }
        return arr;
    }
}
class Task2_32 {

    static void sortWithoutNaN(double[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (Double.isNaN(array[i])) {
                k++;
            }
        }
        if (k == 0) {
            java.util.Arrays.sort(array);
        }
    }
}
