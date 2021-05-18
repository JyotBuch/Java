//Codeforces 266 A https://codeforces.com/problemset/problem/266/A

import java.util.Scanner;

public class Stonesonthetable {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int counter = 0;
		char last = s.charAt(0);

		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == last) counter++;
			else last = s.charAt(i);
		}
		System.out.println(counter);
	}
}
