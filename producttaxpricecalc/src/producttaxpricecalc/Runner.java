package producttaxpricecalc;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidTypeException extends Exception
{
	InvalidTypeException(String s)
	{
		super(s);
	}
}

class InvalidChoiceException extends Exception
{
	InvalidChoiceException(String s)
	{
		super(s);
	}
}

public class Runner 
{
	static void validatetype(Integer type) throws InvalidTypeException
	{
		if(type>3 || type<1)
		{
			throw new InvalidTypeException("Invalid type of product. Press Enter and input correct type.");
		}
	}
   
	private static Scanner sc;

	public static void main(String[] args)
	{
        CustomLinkedList list = new CustomLinkedList();
        sc = new Scanner(System.in);
        
        while(true) 
        {
		    String nname="";
		    while(nname.equalsIgnoreCase("")) {
		    	System.out.println("Enter Item Name: ");
	    		nname=sc.nextLine();
		    	if(nname.isEmpty()) {
		    		nname=sc.nextLine();
		    	}
		    }
		    
		    
		    Double pprice = 0d;
		    Integer qquantity=0,count=1;
		    Integer tchoice=0;
		    String ttype="";
		   do 
		    {
		        try 
		        {
		        	System.out.println("Press 1.If Item Type is Raw\nPress 2.If Item Type is Manufactured\nPress 3.If Item Type is Imported");
		            tchoice = sc.nextInt();
		            if(tchoice==1)
		            	ttype="Raw";
		            else if(tchoice==2)
		            	ttype="Manufactured";
		            else if(tchoice==3)
		            	ttype="Imported";
		            validatetype(tchoice);
		            count=1;
		        } catch (Exception e) 
		        {
		            System.out.println(e.getMessage());
		            count=0;
		        }
		        sc.nextLine(); // clears the buffer
		        }
		    while (count==0);
		    
		    do 
		    {
		        try 
		        {
		        	System.out.println("Enter Item Price: ");
		            pprice = sc.nextDouble();
		        } catch (InputMismatchException e) 
		        {
		            System.out.println("Input valid Price\n");
		        }
		        sc.nextLine(); 
		        }
		    while (pprice <= 0);
		    
		    
		    
		    do 
		    {
		        try 
		        {
		        	System.out.println("Enter Product Quantity: ");
		            qquantity = sc.nextInt();
		        } catch (InputMismatchException e) 
		        {
		            System.out.print("Input valid Quantity\n");
		        }
		        sc.nextLine(); 
		       }
		    while (qquantity <= 0);
			
		    
		    list.insert(nname, ttype,pprice,qquantity);
			
		    
		    System.out.println("Do you want to enter details of any other item (y/n)?");
			String choice = sc.next();
			
			if(choice.equalsIgnoreCase("n"))
				break;
        }
        
        
        list.calculate();
	}
}
