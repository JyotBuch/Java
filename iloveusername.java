import java.util.Scanner;
import java.util.Stack;

public class iloveusername {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,cnt=0;
        int n=sc.nextInt();
        int a[]= new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maxx=a[0];
        int minn=a[0];
        for(i=0;i<n;i++){
            if(a[i]>maxx){
                maxx=a[i];
                cnt++;
            }
            if(a[i]<minn){
                minn=a[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
