// Concept clearing points 

abstract class ABC
{
	abstract void show();
	
}

class B
{
	 void show()
	{
		System.out.println("I am Child Class B");
	}
}

class C
{
	void show()
	{
		System.out.println("I am Child Class C");
	}
}

public class ABCD
{
	public static void main(String x[])
	{
		B b=new B();
		b.show();
		C c=new C();
		c.show();
	}
}