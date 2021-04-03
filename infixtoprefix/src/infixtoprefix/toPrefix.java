package infixtoprefix;

import java.util.Stack;

public class toPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A+B^C*D+E^5";
		getPrefix(s);
	}

	private static void getPrefix(String infix) {
		// TODO Auto-generated method stub
		infix=reverse(infix);
		String postfix="";
		Stack<Character> stack = new Stack<>();
        for (int i=0;i<infix.length();i++)
        {
			char c=infix.charAt(i);
            if (isOperand(c)) {
            	postfix+=c;
				//System.out.print(c);
            }
            else {
                while (!stack.isEmpty() && prec(c) >= prec(stack.peek())) {
					postfix+=stack.pop();
                	//System.out.print(stack.pop());
                }
                stack.add(c);
            }
        }
        while (!stack.isEmpty()) {
        	postfix+=stack.pop();
			//System.out.print(stack.pop());
        }
        
        System.out.println(reverse(postfix));
	}
	
	private static String reverse(String s) {
		// TODO Auto-generated method stub
		String newstr = "";
		for(int i=s.length()-1;i>=0;i--)
			newstr+=s.charAt(i);
		return newstr;
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

}
