package org.bansikah;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("F");
        stack.push("G");
        stack.push("H");
        stack.push("I");
        stack.push("J");
        stack.push("K");
        stack.push("L");
        stack.push("M");
        stack.push("N");
        stack.push("O");
        stack.push("P");
        stack.push("Q");
        stack.push("R");
        stack.push("S");
        stack.push("T");
        stack.push("U");
        stack.push("V");
        stack.push("W");
        stack.push("X");
        stack.push("Y");
        stack.push("Z");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.search("A"));
        System.out.println(stack.search("Z"));

    }
}
