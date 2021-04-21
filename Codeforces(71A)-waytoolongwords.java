//Codeforces 71A https://codeforces.com/problemset/problem/71/A

import java.util.Scanner;

public class waytoolongwords {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String words[]=new String[n];
        for(int i=0;i<n;i++)
        {
            words[i]=sc.next();
            if(words[i].length()>10)
            {
                words[i]=getNewWord(words[i]);
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(words[i]);
        }
    }

    public static String getNewWord(String word)
    {
        String count=Integer.toString(word.length()-2);
        word=word.charAt(0)+count+word.charAt(word.length()-1);
        return word;
    }
}
