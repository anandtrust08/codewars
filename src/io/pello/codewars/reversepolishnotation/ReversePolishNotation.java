package io.pello.codewars.reversepolishnotation;

import java.util.Stack;

public class ReversePolishNotation {
    public int eval(String[] tokens) {

        Stack<Integer> S = new Stack<Integer>();
        int a;
        int b;

        for (String s : tokens) {
            switch (s) {
            case "+":
                S.add(S.pop() + S.pop());
                break;

            case "*":
                S.add(S.pop() * S.pop());
                break;

            case "/":
                b = S.pop();
                a = S.pop();
                S.add(a / b);
                break;
            case "-":
                b = S.pop();
                a = S.pop();
                S.add(a - b);
                break;
            default:
                S.add(Integer.parseInt(s));
                break;
            }

        }
        return S.pop();
    }
}
