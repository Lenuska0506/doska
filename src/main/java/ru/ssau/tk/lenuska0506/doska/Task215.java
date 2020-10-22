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
 class Task224 {
    static void getBitovoeOtricanie(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ~arr[i];
        }

    }
}
 class Task225 {
    static int[] getArrBitovoeOtricanie(int[] arr) {
        int[] arrnot = new int[arr.length];
        for (int i = 0; i < arrnot.length; i++) {
            arrnot[i] = arr[i];
        }
        for (int i = 0; i < arrnot.length; i++) {
            arrnot[i] = ~arrnot[i];
        }
        return arrnot;
    }
}
 class Task227 {
    static boolean[] getboolean(int[] arr) {
        boolean[] arrboolean = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrboolean [i] = arr[i] % 2 == 0;
        }
        return arrboolean ;
    }
}
 class Task233 {
    static void getArrSting(String[] arr) {
        for (String i : arr) {
            System.out.print(i);
        }
    }
}
 class Task226 {
    static int[] getSumParn(int[] arr) {
        int[] arr1 = new int[arr.length / 2 + (arr.length % 2 == 0 ? 0 : 1)];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[2 * i] + (2 * i + 1 < arr.length ? arr[2 * i + 1] : 0);
        }
        return arr1;
    }
}
 class Task213 {
    public static int[] getArr(int n) {
        if (n == 0){
            return null;
        }
        int[] arr = new int[n];
        for (int i = 0; i < Math.ceil((double)n/2); i++){
            arr[i] = i+1;
            arr[n-i-1] = i+1;
        }
        return arr;
    }
}
 class Task25 {
    public static int[] setNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr;
    }
}
 class Task211 {
    static int[] getdelitei(int n) {
        int c = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                c++;
            }
        }
        int[] arr = new int[c * 2 + (Math.sqrt(n) == (int) Math.sqrt(n) ? 1 : 0)];
        int j = 0;
        for (int i = 0; i < (int) Math.sqrt(n); i++) {
            if (n % (i + 1) == 0) {
                arr[j] = (i + 1);
                arr[arr.length - j - 1] = n/ (i + 1);
                j++;
            }
        }
        return arr;
    }
}
