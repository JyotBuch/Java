//Codeforces 703 A https://codeforces.com/problemset/problem/703/A

import java.util.Scanner;

public class mishkaandgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int matches = sc.nextInt();
        int dice[][]=new int[matches][2];
        int winnerM=0,winnerC=0,tie=0;
        for(int i=0,j=0;i<matches;i++)
        {
            dice[i][0]=sc.nextInt();
            dice[i][1]=sc.nextInt();
            if(dice[i][0]>dice[i][1])
                winnerM++;
            if(dice[i][0]<dice[i][1])
                winnerC++;
            if(dice[i][0]==dice[i][1])
                tie++;
        }
        if(winnerM>winnerC)
            System.out.println("Mishka");
        else if(winnerM<winnerC)
            System.out.println("Chris");
        else if(winnerM==winnerC)
            System.out.println("Friendship is magic!^^");
    }
}
