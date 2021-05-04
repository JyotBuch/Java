import java.util.Scanner;

public class redandbluebeans{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        //int array[][]=new int[t][3];
        int r,b,diff;
        int temp;
        for(int i=0;i<t;i++)
        {
            r=sc.nextInt();
            b=sc.nextInt();
            diff=sc.nextInt();
            if(r>b)
            {
                temp=r;
                r=b;
                b=temp;
            }
            if(r*(diff+1)>=b)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}