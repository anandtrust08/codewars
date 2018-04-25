package io.pello.codewars.bracechecker;

import java.util.Stack;

public class BraceChecker {

    public boolean isValid(String braces) {
        boolean result = false;
        Stack<String> code = new Stack<String>();
        System.out.println("------ " + braces +" --------------------------------");;
        for (int i = 0; i < braces.length(); i++) {
            if (braces.charAt(i) == '{' || braces.charAt(i) == '[' || braces.charAt(i) == '(') {
                code.push(braces.charAt(i) + "");
            } else if (braces.charAt(i) == '}') {
                if (code.size() == 0 || !code.pop().equals("{")) {
                    return false;
                }
            } else if (braces.charAt(i) == ']') {
                if (code.size() == 0 || !code.pop().equals("[")) {
                    return false;
                }
            } else if (braces.charAt(i) == ')') {
                if (code.size() == 0 || !code.pop().equals("(")) {
                    return false;
                }
            } 
            System.out.println(code);
        }

        return code.size() == 0;
    }
}
