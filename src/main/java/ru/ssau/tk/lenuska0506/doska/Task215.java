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
 class Task218 {
    static Integer Maxvalue(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int max = 0;
        for (int i : arr) {
            if (arr[i + 1] > arr[i]) {
                max=  arr[i + 1];
            }

        }

        return max;
    }
}
 class Task219 {
     static int getArrSum(int[] arr) {
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             if (i % 2 == 0) {
                 sum = arr[i];
                 sum += arr[i];
             }
         }
         return sum;
     }
 }
 class  Task222 {
    static   int  getIndexVhodnogoN ( int [] arr , int  N ) {
        int k =  0 ;
        for ( int i =  0 ; i < arr . length; i ++ ) {
            if (arr [i] == N) {
                k = i;
            }
        }
        return k;
    }
}

 class Task223 {
    static void setArr(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
            min = arr[i] < min ? arr[i] : min;
        }
        int indexmin = 0;
        int indexmax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                indexmin = i;
            }
            if (arr[i] == max) {
                indexmax = i;
            }
        }
        arr[indexmin] = max;
        arr[indexmax] = min;
    }
}