eeeepackage matrixmultiplication;

import java.util.*;

public class multimatrix {
	
	public static void display(int[][] matrix) {
        System.out.println("Elements are :");
 
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
	
	public static int[][] insert() {
		int m1[][] = new int[3][3];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<=2;i++) 
		{
			for(int j=0;j<=2;j++) 
			{
				System.out.println("Enter Element at position i= "+(i+1)+" and j= "+(j+1));
				m1[i][j]=sc.nextInt();
			}
		}
		return m1;
		}
	
	public static int[][] calculate(int [][]m1, int [][]m2){
		int ans[][] = new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				ans[i][j]=0;
				for(int k=0;k<3;k++)
				{
					ans[i][j]+= m1[i][k]*m2[k][j];
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Matrix Multiplication Program");
		System.out.println("Enter First 3X3 Matrix\n");
		
		Scanner sc = new Scanner(System.in);
		
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		int ans[][]=new int[3][3];
		
		arr1 = insert();
		display(arr1);
		
		arr2 = insert();
		display(arr2);
		
		ans =calculate(arr1,arr2);
		sc.close();
		
		display(ans);
		}
	
	}
