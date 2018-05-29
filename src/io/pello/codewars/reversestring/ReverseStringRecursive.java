package io.pello.codewars.reversestring;

public class ReverseStringRecursive {
    public String reverseString(String string) {
        if (null == string || string.length() <= 1) {
            return string;
        }

        int length = string.length();

        String leftString = string.substring(0, length / 2);
        String rightString = string.substring(length / 2, length);

        return reverseString(rightString) + reverseString(leftString);
    }
}
