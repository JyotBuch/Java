import java.util.Scanner;

public class boyorgirl {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int distinct=s.length();
        boolean visited[]=new boolean[s.length()];
        for(int i=0;i<s.length();i++)
        {
            visited[i]=true;
            for(int j=i+1;j<s.length();j++)
            {
                if(!visited[j])
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        distinct-=1;
                        visited[j]=true;
                    }
                }
            }
        }
        if(distinct%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
