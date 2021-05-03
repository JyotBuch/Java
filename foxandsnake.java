import java.util.Scanner;

public class foxandsnake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int i,j;
        for(i=1; i<=n; i++)
    {
        if(i%4==2)
        {
            for(j=1; j<m; j++)
            {
                System.out.print(".");
            }
            System.out.print("#\n");
        }
        else if(i%4==0)
        {
            System.out.print("#");
            for(j=1; j<m; j++)
            {
                System.out.print(".");
            }
            System.out.print("\n");
        }
        else
        {
            for(j=1; j<=m; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }

    }
    }
}
