package inheritancesuperclassJAVA;

import java.util.Scanner;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Square[] sq= new Square[10];
		double side;
		for(int i=0;i<10;i++) {
			System.out.println("Enter side");
			side = sc.nextDouble();
			sq[i]= new Square(side);
			}
		
		for(int i=0;i<10;i++) {
			sq[i].getArea();
			sq[i].getPerimeter();
		}
		
		
	}

}
