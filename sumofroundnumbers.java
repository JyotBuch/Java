import java.util.Scanner;

public class sumofroundnumbers {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int n;
        int temp,rem;
        int j,k;
        int power=1;
        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            temp=n;
            j=0;
            while(temp!=0)
            {
                rem=temp%10;
                //rem=(int)(rem*Math.pow(10, j));
                if(rem!=0)
                    System.out.print(rem*power+" ");
                temp=temp/10;
                power*=10;
                j++;
            }
            
            System.out.println();
        }
    }
}
