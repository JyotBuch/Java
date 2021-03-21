package binarydecimal;
import java.util.*;

public class getNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to convert to Binary\nPress 2 to convert to decimal");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:System.out.println("Enter Decimal number");
				int decimal=sc.nextInt();
				toBinary(decimal);
				break;
		case 2:System.out.println("Enter Binary Number");
				int binary=sc.nextInt();
				toDecimal(binary);
				break;
		default:System.out.println("Invalid Choice");
				break;
		}
		sc.close();
	}

	private static void toDecimal(int binary) {
		// TODO Auto-generated method stub
		int temp=binary, count=0, decimal=0,rem=0;
		while(temp!=0) {
			rem=temp%10;
			decimal+=((int)Math.pow(2, count))*rem;
			count++;
			temp=temp/10;
		}
		System.out.println(decimal);
	}

	private static void toBinary(int decimal) {
		// TODO Auto-generated method stub
		int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	       }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);
	       }
	}

}
