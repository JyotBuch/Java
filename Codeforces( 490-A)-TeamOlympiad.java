//Codeforces 490 A https://codeforces.com/problemset/problem/490/A

import java.util.Scanner;

public class teamolympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1[] = new int[5000]; 
        int t2[] = new int[5000]; 
        int t3[] = new int[5000]; 
        int n,i,x=0,y=0,z=0,min;
        n=sc.nextInt();
        int a[] = new int [n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]==1){
                t1[x]=i+1;
                x++;
            }
            else if(a[i]==2){
                t2[y]=i+1;
                y++;
            }
            else if(a[i]==3){
                t3[z]=i+1;
                z++;
            }
        }
        min=Math.min(x,Math.min(y, z));
        System.out.println(min);
        for(i=0;i<min;i++){
            System.out.println(t1[i]+" "+t2[i]+" "+t3[i]);
        }
    }
}
