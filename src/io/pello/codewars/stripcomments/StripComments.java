package io.pello.codewars.stripcomments;

public class StripComments {

        public static String stripComments(String text, String[] commentSymbols) {
            String result = "";
            boolean comment = false;

            for (int i = 0; i < text.length(); i++) {
                if (comment) {
                    if (text.charAt(i) == '\n') {
                        comment = false;
                    }
                }

                if (!comment) {
                    if (java.util.Arrays.asList(commentSymbols)
                        .indexOf(text.charAt(i) + "") != -1) {
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
            return result.replaceAll("[ ]+$", ""); // result.substring(0, result.length() - 1);
            }


}
