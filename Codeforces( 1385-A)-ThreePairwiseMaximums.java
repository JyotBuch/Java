//Codeforces 1385 A https://codeforces.com/problemset/problem/1385/A

import java.util.Scanner;

public class threepairwisemaximum {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int x, y, z, a=0, b=0, c=0, flag=1;
        while (t>0)
        {
            flag=0;
            x= sc.nextInt();
            y= sc.nextInt();
            z= sc.nextInt();
            if (x == y && y==z){
                flag = 1;
                a=x;
                b=y;
                c=z;
            }
            else if (x == y && y>z){
                flag = 1;
                a=x;
                b=z;
                c=z;
            }
            else if (x == z && z>y){
                flag = 1; 
                a=y;
                b=x;
                c=y;
            }
            else if (y == z && z>x){
                flag = 1; 
                a=x;
                b=x;
                c=y;
            }
            if (flag>0){
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }else {
                System.out.println("NO");
        }
        t-=1;
    }
  }
}
