package ru.ssau.tk.lenuska0506.doska;

public class Task311 {
    static int theNumberOfStringArray(String[] arr, String prefix, String postfix) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
        }
        for (String str : arr) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                number++;
            }
        }
        return number;
    }
}
class Task312 {
    static String set(String _1str, String _2str, String _3str) {
        for (int i = 0; i < 100 && _1str.contains(_2str); i++) {
            _1str = _1str.replaceAll(_2str, _3str);
        }
        return _1str;
    }
}
