package orderofsentence;

public class constructorchain {
	
	constructorchain(){
		System.out.println("This is the first sentence");
	}
	constructorchain(int order){
		this("order",2);
		System.out.println("This is the third sentence");
	}
	constructorchain(String s,int order)
	{
		this();
		System.out.println("This is the second sentence");
	}
	void display() 
	{
		System.out.println("This is the fourth sentence");
	}
	
	public static void main(String[] args) 
    {  
		constructorchain obj = new constructorchain(1995);  
     obj.display(); 
    }
}
