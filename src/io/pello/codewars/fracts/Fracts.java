package io.pello.codewars.fracts;

import java.util.Arrays;

public class Fracts {
    public static String convertFrac(long[][] lst) {

        if (null == lst || lst.length == 0)
            return "";
        long[] ordered = new long[lst.length];

        long max = 1;
        for (int i = 0; i < lst.length; i++) {
            ordered[i] = lst[i][1];
            max = max * lst[i][1];
        }

        Arrays.sort(ordered);

        long com = max;
        for (long i = ordered[ordered.length - 1]; i <= max; i++) {
            boolean found = true;
            long partial = com;
            for (int j = 0; j < lst.length; j++) {
                if (i % ordered[j] != 0) {
                    found = false;
                    break;
                }
            }

            if (found) {
                com = i;
                System.out.println("Found!! " + com);
                break;
            }
        }

        String result = "";
        for (int i = 0; i < lst.length; i++)
            result += "(" + (lst[i][0] * (com / lst[i][1])) + "," + com + ")";

        return result;
    }
}
