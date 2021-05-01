//Codeforces 141  A https://codeforces.com/problemset/problem/141/A

import java.util.Scanner;
 
public class AmusingJoke {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String n = sc.nextLine().toLowerCase();
        String p = sc.nextLine().toLowerCase();
        String sn = s+n;
        if(sn.length() == p.length()){
            boolean flag = false;
            for(char aa='a';aa<='z';aa++){
                if(sn.contains(String.valueOf(aa))){
                    sn = sn.replaceAll(String.valueOf(aa), "");
                    int x = sn.length();
                    p = p.replaceAll(String.valueOf(aa), "");
                    int y = p.length();
                    if(x != y){
                        flag = true;
                        break;
                    }                    
                }
            }
            if(!flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}
