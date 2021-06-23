package com.hugo.programmer.lagou.microsoft685;

import java.util.Stack;

/**
 * @author hugo0129
 * 有效的括号：https://leetcode-cn.com/problems/valid-parentheses
 */
public class ValidParentheses {

    /**
     * 字符串只包含简单的左括号 (和)右括号
     * 使用栈
     *
     * @param s
     * @return
     */
    public boolean simpleIsValid(String s) {
        /**
         * 1.边界判断
         */
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }

        /**
         * 2.取消法
         */
        Stack<Character> stack = new Stack<>();
        char left = '(';
        char right = ')';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == left) {
                stack.push(c);
            } else if (c == right) {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }

    /**
     * 不使用栈
     *
     * @param s
     * @return
     */
    public boolean simpleSameIsValid(String s) {
        /**
         * 1.边界判断
         */
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }

        /**
         * 2.取消法
         */
        int leftBraceNumber = 0;
        char left = '(';
        char right = ')';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == left) {
                leftBraceNumber++;
            } else if (c == right) {
                if (leftBraceNumber <= 0) {
                    return false;
                }
                --leftBraceNumber;
            }
        }
        return leftBraceNumber == 0;
    }

    /**
     * https://leetcode-cn.com/problems/valid-parentheses
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}') {
                if (stack.empty() || stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            } else if (c == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            } else if (c == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();
    }
}
