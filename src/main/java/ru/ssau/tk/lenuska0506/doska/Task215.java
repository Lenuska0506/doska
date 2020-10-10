package ru.ssau.tk.lenuska0506.doska;

public class Task215 {
         static boolean setArr(int[] arr, int n) {
            for (int j : arr) {
                if (j == n) {
                    return true;
                }
            }
            return false;
        }
    }
 class Task216 {
    static boolean setArr(Integer[]  arr) {
        for (int n : arr) {
            if (arr[n] == null) {
                return true;
            }
        }
        return false;
    }
}
class Task217 {
    static int number(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (arr[i] % 2 == 0) {
                count+=1;
            }
        }
        return count;
    }
}
