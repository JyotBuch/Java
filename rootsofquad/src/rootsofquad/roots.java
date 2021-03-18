//Java Program to Find all Roots of a Quadratic Equation

package rootsofquad;
import java.util.*;
import java.math.*;

public class roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter variables a,b,c respectively for the quadratic equation ax^2+bx+c");
		float a=sc.nextInt();
		float b=sc.nextInt();
		float c=sc.nextInt();
		getroots(a,b,c);
		sc.close();
	}

	private static void getroots(float a, float b, float c) {
		// TODO Auto-generated method stub
		double D = b * b - 4 * a * c;
		double root1, root2;
	    if (D > 0) {
	    	root1 = (-b + Math.sqrt(D)) / (2 * a);
	    	root2 = (-b - Math.sqrt(D)) / (2 * a);

	      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
	    }
	    else if (D == 0) {
	      root1 = root2 = -b / (2 * a);
	      System.out.format("root1 = root2 = %.2f;", root1);
	    }
	    else {
	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-D) / (2 * a);
	      System.out.format("Root1 = %.2f+%.2fi", real, imaginary);
	      System.out.format("\nRoot2 = %.2f-%.2fi", real, imaginary);
	    }
	}

}
