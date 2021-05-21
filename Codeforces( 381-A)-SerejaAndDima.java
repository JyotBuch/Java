//Codeforces 381 A https://codeforces.com/problemset/problem/381/A

import java.util.Scanner;

public class serejaanddima {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);   
        int n;
        n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=n-1;
        int l=0;
        int sscore=0;
        int dscore=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(arr[r]>arr[l])
                {
                    sscore+=arr[r];
                    --r;
                }
                else if(arr[r]<arr[l]){
                sscore+=arr[l];
                    ++l;
                }
                else{
                sscore+=arr[l];	
                }
            }
            else{
                if(arr[r]>arr[l])
                {
                    dscore+=arr[r];
                    --r;
                }
                else if(arr[r]<arr[l]){
                dscore+=arr[l];
                    ++l;
                }
                    else{
                dscore+=arr[l];	
                }
            }
        }
        System.out.print(sscore+" "+dscore) ; 
    }
}
