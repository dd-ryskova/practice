package ru.ssau.tk.DDRyskovaCo.practice.String.Tasks20;

public class ClassForOtherTasks {

    public static int countOfLinesIgnoreTheSpace(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String s : array) {
            if (s.trim().startsWith(prefix) && s.trim().endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    public static String replacementTheString(String s1, String s2, String s3) {
        String s4 = s1;
        for (int i = 0; s4.contains(s2) && i < 100; ++i) {
            s4 = s4.replaceAll(s2, s3);
        }
        return s4;
    }

    public static String substringOfString(String s1, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > s1.length()) {
            to = s1.length();
        }
        if (to <= from) {
            return "";
        }
        return s1.substring(from, to);
    }
}
