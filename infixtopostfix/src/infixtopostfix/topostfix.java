package infixtopostfix;

import java.util.Scanner;
import java.util.Stack;
import java.util.Stack;
 
class topostfix
{
    public static void ToPostfix(String infix)
    {
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<infix.length();i++)
        {
			char c=infix.charAt(i);
            if (c == '(') {
                stack.add(c);
            }
            else if (c == ')')
            {
                while (stack.peek() != '(') {
					System.out.print(stack.pop());
                }
                stack.pop();
            }
            else if (isOperand(c)) {
				System.out.print(c);
            }
            else {
                while (!stack.isEmpty() && prec(c) >= prec(stack.peek())) {
					System.out.print(stack.pop());
                }
                stack.add(c);
            }
        }
        while (!stack.isEmpty()) {
			System.out.print(stack.pop());
        }
    }
	public static int prec(char c)
    {
        if (c == 'x' || c == '/' || c=='*') {
            return 1;
        }
 
        if (c == '+' || c == '-') {
            return 2;
        }
        if (c == '^') {
            return 3;
        }
        if (c == '|') {
            return 4;
        }
        return Integer.MAX_VALUE;
    }

    public static boolean isOperand(char c)
    {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ||
            (c >= '0' && c <= '9');
    }
 
    public static void main(String[] args)
    {
        String infix = "A+B^C*D+E^5";//5EDCBA^+^+*
 
        ToPostfix(infix);
    }
}
