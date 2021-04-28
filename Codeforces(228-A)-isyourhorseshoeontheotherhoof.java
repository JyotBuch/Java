//Codeforces 228 A https://codeforces.com/contest/228/problem/A

import java.util.*;

public class isyourhorseshoeontheotherhoof {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        HashSet <Integer> horseshoe = new HashSet<>();
        for(int i=0;i<4;i++)
            horseshoe.add(sc.nextInt());
        System.out.print(4-horseshoe.size());
    }
}
