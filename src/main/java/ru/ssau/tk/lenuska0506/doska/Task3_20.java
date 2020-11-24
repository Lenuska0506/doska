package ru.ssau.tk.lenuska0506.doska;

import java.util.Objects;

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
 class Task3_5 {
    static boolean differentStr(String str1,String str2){
        return !Objects.equals(null, str1) && !Objects.equals(null, str2)
                && !str1.equals(str2)
                && str1.equalsIgnoreCase(str2);
    }
}

