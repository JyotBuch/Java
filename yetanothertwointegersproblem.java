import java.util.Scanner;

public class yetanothertwointegersproblem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t= sc .nextInt();
        int temp=0;
        long a,b;
        while(t>0)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            long cnt=0,ans=0;
            cnt =  (Math.abs(a - b) % 10);
		    ans =  (Math.abs(a - b) / 10);
		    if(cnt > 0) ans ++;
            System.out.println(ans);
            t-=1;
        }
    }   
}
