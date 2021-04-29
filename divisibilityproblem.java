import java.util.Scanner;

public class divisibilityproblem {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        int t=sc.nextInt();
        int ans[]=new int[t];
        int count=0;
        int a,b;
        while(t>0)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            if(a%b==0)
                System.out.println("0");
            else
                System.out.println(b-a%b);
            t--;
        }
    }  
}
