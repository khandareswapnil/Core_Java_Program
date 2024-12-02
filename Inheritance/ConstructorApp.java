// constructor  

abstract class Constructor
{
	Constructor(int x)
	{
		System.out.println("The Value of X is "+x);
	}
	
}

class B extends Constructor
{	
	
	 void show()
	{
		System.out.println("HI AM CHILD CLASS");
	}
	{
		super(100);
	}
}
public class ConstructorApp
{
	public static void main(String x[])
	{
		
		B c=new B();
		c.show();
	}
} 
