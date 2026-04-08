package pekan3_2511533013;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_3013 {
    public static int postfixEvaluate_3013(String expression) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner input = new Scanner(expression);
        while (input.hasNext()) {
            if (input.hasNextInt()) {
                stack.push(input.nextInt());
            } else {
                String operator_3013 = input.next();
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                if (operator_3013.equals("+")) {
                    stack.push(operand1 + operand2);
                } else if (operator_3013.equals("-")) {
                    stack.push(operand1 - operand2);
                } else if (operator_3013.equals("*")) {
                    stack.push(operand1 * operand2);
                } else if (operator_3013.equals("/")) {
                    stack.push(operand1 / operand2);
                } else {
                    stack.push(operand1 / operand2);
                }
            } 
        }
        return stack.pop();
    }
        public static void main(String[] args) {
            System.out.println("hasil postfix= "+postfixEvaluate_3013("5 2 4 * + 7 -"));
        }
    }

