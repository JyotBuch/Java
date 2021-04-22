//Code forces 617 A https://codeforces.com/problemset/problem/617/A

import java.util.Scanner;

public class elephant {
        public static void main(String [] args)
        {
            Scanner sc= new Scanner(System.in);
            int x=sc.nextInt();
            int count=0;
            while(x>0)
            {
                if(x-5>=0)
                {
                    x-=5;
                    count++;
                }
                else if(x-4>=0)
                {
                    x-=4;
                    count++;
                }
                else if(x-3>=0)
                {
                    x-=3;
                    count++;
                }
                else if(x-2>=0)
                {
                    x-=2;
                    count++;
                }
                else if(x-1>=0)
                {
                    x-=1;
                    count++;
                }
            }
            System.out.println(count);
        }
}
