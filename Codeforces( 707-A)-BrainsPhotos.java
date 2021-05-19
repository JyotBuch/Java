//https://codeforces.com/contest/707/problem/A

import java.util.HashSet;
import java.util.Scanner;

public class brainsphotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int runs = rows*columns;

        HashSet<String> map = new HashSet<String>();

        for(int i=0;i<runs;i++)
        {
            map.add(sc.next());
        }

        if(map.contains("B") && map.contains("W") && map.size()==2)
        {
            System.out.println("#Black&White");
        }
        if(map.contains("W") && map.contains("G") && map.size()==2)
        {
            System.out.println("#Black&White");
        }
        if(map.contains("B") && map.contains("G") && map.size()==2)
        {
            System.out.println("#Black&White");
        }
        if(map.contains("B") && map.contains("W") && map.contains("G") && map.size()==3)
        {
            System.out.println("#Black&White");
        }
        else if(map.contains("B") || map.contains("W") || map.contains("G"))
        {
            if(map.size()==1)
                {
                    System.out.println("#Black&White");
                }
        }
        if(map.contains("C") || map.contains("M") || map.contains("Y"))
            System.out.println("#Color");
    }
}
