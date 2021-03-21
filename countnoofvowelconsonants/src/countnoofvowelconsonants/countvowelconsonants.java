package countnoofvowelconsonants;

import java.util.Scanner;

public class countvowelconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String s = sc.nextLine();
		int vowel=0,consonant=0;
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				vowel++;
			else
				consonant++;
		}
		System.out.println("Number of vowels are: "+vowel);
		System.out.println("Number of consonants are: "+consonant);
		sc.close();
	}

}
