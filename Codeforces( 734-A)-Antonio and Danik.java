//Codeforces 734 A https://codeforces.com/contest/734/problem/A

import java.util.Scanner;

public class antonanddanik {
    public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String games=sc.next();
        int countA=0;
        int countD=0;
        for(int i=0;i<n;i++)
        {
            if(games.charAt(i)=='A')
                countA+=1;
            if(games.charAt(i)=='D')
                countD+=1;
        }
        if(countA==countD)
            System.out.println("Friendship");
        else if(countA<countD)
            System.out.println("Danik");
        else if(countA>countD)
            System.out.println("Anton");
    }
}
