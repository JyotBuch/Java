package producttaxpricecalc;

public class CustomLinkedList {
	Node head;

    public void insert(String name,String type,double price,int quantity) 
    {        
        		Node newNode = new Node(name,type,price,quantity);
				if(head == null) 
				{
				    head = newNode;
				}
				else 
				{
				    Node n = head;
				    while(n.next != null) 
				    {
				        n = n.next;
				    }
				    n.next = newNode;
				}
				
    }


    public void calculate() 
    {
        Node currentNode = head;
        if(currentNode == null)
        {
            System.out.println("Linked list is empty");
        }
        else 
        {
        	System.out.println("1.Item name\t2.Item Price\t3.Sales tax Liability Per Item\t4.Final Item Price\n");
            while(currentNode != null) 
            {
            	if(currentNode.type.equalsIgnoreCase("raw"))
                {
                	currentNode.st= raw(currentNode.price);
                	currentNode.fp= currentNode.st+currentNode.price;
                }
            	if(currentNode.type.equalsIgnoreCase("manufactured"))
                {
                	currentNode.st= manufactured(currentNode.price);
                	currentNode.fp= currentNode.st+currentNode.price;
                }
            	if(currentNode.type.equalsIgnoreCase("imported"))
                {
                	currentNode.st= imported(currentNode.price);
                	if((currentNode.st+currentNode.price)<=100)
                	{
                		currentNode.st = currentNode.st+5;
                	}
                	else if((currentNode.st+currentNode.price)>100 && (currentNode.st+currentNode.price)<=200 )
                	{
                		currentNode.st = currentNode.st+10;
                	}
                	else if((currentNode.st+currentNode.price)>200)
                	{
                		currentNode.st = currentNode.st+(0.05*(currentNode.st+currentNode.price));
                	}
                	else
                	{
                		System.out.println("Invalid Product Type");
                		System.exit(0);
                	}
                }
                	
                	currentNode.fp= currentNode.st+currentNode.price;
                
            	
                System.out.print(currentNode.name + "\t\t"+currentNode.price+"\t\t"+currentNode.st+"\t\t\t"+currentNode.fp+"\n");
                currentNode = currentNode.next;
                }
            }
        }
    public Double raw(double price) 
    {
    	Double ST= 0.125*price;
    	return ST;
    	
    }
    public Double manufactured(double price) 
    {
    	Double ST= 0.125*price+((0.02*0.125*price)+price);
    	return ST;
    	
    }
    public Double imported(double price) 
    {
    	Double ST= 0.1*price;;
    	return ST;
    	
    }
}
