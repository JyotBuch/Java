// Java Program to find the transpose of a given matrix
package transmatrix;
import java.util.*;

public class transposeMatrix {
	
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
		sc.close();
		return m1;
		}
	
	public static void display(int[][] matrix) {
        
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
	
	public static int[][] transpose(int[][] matrix){
		int m1[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				m1[j][i]=matrix[i][j];
			}
		}
		return m1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]=new int[3][3];
		int transposeM[][]=new int[3][3];
		
		arr1 = insert();
		System.out.println("Elements are :");
		 
		display(arr1);
		
		transposeM = transpose(arr1);
		
		System.out.println("Transpose is :");
		display(transposeM);
	}

}
