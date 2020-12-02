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
