package com.espark.adarsh;

import java.util.Stack;

public class ApplicationMain {

    public static void main(String[] args) {
        System.out.println("1st Expression "+validateExpression("{5+{a+b}*10}+(10-9)+3+[3*(a+b)-c]"));
        System.out.println("2nd Expression "+validateExpression("(4*3+2]+a-[3-2)"));
        System.out.println("3rd Expression "+validateExpression("{5+{a+b}*10}+(10-9)+3+[3*(a+b)-c])"));
        System.out.println("4th Expression "+validateExpression("{([])}"));
    }

    public static boolean validateExpression(String expression) {
        boolean response = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c >= 65 && c <= 90 || c >= 97 && c <= 122
                    || c >= 48 && c <= 57
                    || c == '*' || c == '+' || c == '/' || c == '-') {
                continue;
            } else {
                if (stack.isEmpty()) {
                    response = false;
                    return response;
                }
                char stackTop = stack.peek();
                if (c == ')' && stackTop == '(' || c == '}' && stackTop == '{' || c == ']' && stackTop == '[') {
                    stack.pop();
                } else {
                    response = false;
                    return response;
                }
            }
        }

        if (stack.isEmpty()) {
            response = true;
        }

        return response;
    }
}
