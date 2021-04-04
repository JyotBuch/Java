package backSpaceCompare;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "a##d";
		String T = "#a#d";
		boolean check = backspaceCompare(S, T);
		if (check)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are unequal");
	}

	public static boolean backspaceCompare(String S, String T) {
        // O(n+m)
        return delete(S).equals(delete(T));
    }
    
    private static String delete(String s) {
        Stack<Character> stk = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i = 0 ; i < s.length(); i++) {
            if (ch[i]!='#') {
                stk.push(ch[i]);
            } else {
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            }
        }
        
        return String.valueOf(stk);
    }

}
