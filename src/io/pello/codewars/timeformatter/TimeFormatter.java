package io.pello.codewars.timeformatter;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if (seconds == 0)
            return "now";

        List<Integer> values = new ArrayList<Integer>();
        List<String> listNames = new ArrayList<String>();

        int division[] = new int[] { 31536000, 86400, 3600, 60, 1 };
        String names[] = new String[] { "year", "day", "hour", "minute", "second" };

        String result = "";
        int remain = seconds;

        for (int i = 0; i < division.length; i++) {
            if (remain >= division[i]) {
                values.add(remain / division[i]);
                listNames.add(names[i]);
                remain %= division[i];
            }
        }

        if (values.size() == 1) {
               return values.get(0) + " " + listNames.get(0) + (values.get(0) > 1 ? "s" : "");
        } else {
            int i = 0;
            for (i = 0; i < values.size()-1; i++) {
                String suffix = values.get(i) > 1 ? "s" : "";
                result += values.get(i) + " " + listNames.get(i) + suffix + ", ";
            }
            result = result.substring(0,result.length()-2)+ " and " + values.get(i) + " " + listNames.get(i) + (values.get(i) > 1 ? "s" : "");
        }

        return result;
    }
}
