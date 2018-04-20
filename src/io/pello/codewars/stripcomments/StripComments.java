package io.pello.codewars.stripcomments;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String result = "";
        boolean comment = false;

        for (int i = 0; i < text.length(); i++) {
            if (comment) {
                if (text.charAt(i) == '\n') {
                    System.out.println("Found jump whe commen ");
                    comment = false;
                }
            }

            if (!comment) {
                if (java.util.Arrays.asList(commentSymbols)
                    .indexOf(text.charAt(i) + "") != -1) {
                    System.out.println("Yea, comment: " + text.charAt(i));
                    comment = true;
                } else {
                    if (text.charAt(i) == '\n') {
                        result = result.replaceAll("[ ]+$", "") + "\n";
                    } else {
                        result += text.charAt(i);
                    }
                }
            }
        }
        return result.trim(); // result.substring(0, result.length() - 1);
    }

}
