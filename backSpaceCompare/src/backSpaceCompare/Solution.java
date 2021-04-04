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

	public String Compare(String S){
         Stack<Character> ar=new Stack<>();
        StringBuilder as=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='#' && ar.size()!=0 && ar.peek()!='#'){
                ar.pop();
                continue;
            }
            ar.add(S.charAt(i));
        }
        while(ar.size()!=0){
            if(ar.peek()=='#'){
                ar.pop();
            }
            else{
            as.append(ar.pop());
            }
        }
        return as.reverse().toString();
    }
    public boolean backspaceCompare(String S, String T) {
        S=Compare(S);
        T=Compare(T);
        return S.equals(T);
    }

}
