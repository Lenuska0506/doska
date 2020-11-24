package ru.ssau.tk.lenuska0506.doska;

public class Task3_20 {

       static String getUnifiedStr(String[] array) {
            return String.join(", ", array);
        }
    }
 class Task3_4 {
    static boolean palindrom(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}

